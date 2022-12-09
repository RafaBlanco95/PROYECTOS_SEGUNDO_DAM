package com.example.nextpotify;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.Nullable;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class MyProfileActivity extends AppCompatActivity {
    RequestQueue requestQueue;
    private ImageView iv1;
    final int CAPTURA_IMAGEN = 1;
    TextView tv1;
    String[] archivos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);
        iv1 = findViewById(R.id.iv1);
        tv1=findViewById(R.id.userNameProfileName);
        archivos =fileList();
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap. ic_launcher);
        tv1.setText(getUser(archivos));

    }

    public String getUser(String[] archivos){
        String user = "";
        if(archivoExiste(archivos, "user.txt")){

            try {
                InputStreamReader archivo = new InputStreamReader(openFileInput("user.txt"));
                BufferedReader br = new BufferedReader(archivo);
                String line = br.readLine();

                while(line != null){
                    user = user + line + "\n";
                    line = br.readLine();
                }
                br.close();
                archivo.close();

            }catch (IOException e){
                e.getMessage();
            }

        }
        return user;
    }
    public void tomarFoto(View v) {
        Intent intento1 = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intento1, CAPTURA_IMAGEN);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==CAPTURA_IMAGEN && resultCode==RESULT_OK){
            Bundle extras=data.getExtras();
            Bitmap bitmap1=(Bitmap)extras.get("data");
            iv1.setImageBitmap(bitmap1);
            try {
                FileOutputStream fos=openFileOutput(crearNombreArchivoJPG(),
                        Context.MODE_PRIVATE);
                bitmap1.compress(Bitmap.CompressFormat.JPEG,100,fos);
                fos.close();
            }catch (Exception e){
            }
        }
    }
    private String crearNombreArchivoJPG() {
        String fecha= new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        return fecha+ ".jpg";

    }

    private boolean archivoExiste(String archivos [], String nombreArchivo){
        for(int i = 0; i < archivos.length; i++){
            if(nombreArchivo.equals(archivos[i])){
                return true;
            }
        }
        return false;
    }

    public void checkDeleteUser(View view) {

        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("¿Desea eliminar su cuenta de forma definitiva?");
        // alert.setMessage("Message");

        alert.setPositiveButton("Sí", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                deleteUser();

            }
        });

        alert.setNegativeButton("No",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {

                    }
                });

        alert.show();
    }


    public void goToMainView(){
        Intent siguiente= new Intent(this,MainActivity.class);
        startActivity(siguiente);
    }

    //Método para mostrar y ocultar el menú
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.overflow, menu);
        return true;
    }

    //Método para asignar las funciones correspondientes a las opciones.
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id == R.id.item1){
            Toast.makeText(this, "Opción 1", Toast.LENGTH_SHORT).show();
        } else if(id == R.id.item2){
            Toast.makeText(this, "Opción 2", Toast.LENGTH_SHORT).show();
        }else if(id == R.id.item3){
            Toast.makeText(this, "Opción 3", Toast.LENGTH_SHORT).show();
        }else if(id == R.id.compartir){
            Toast.makeText(this, "Compartir", Toast.LENGTH_SHORT).show();
            return true;
        }else if(id == R.id.Buscar){
            Toast.makeText(this, "Buscar", Toast.LENGTH_SHORT).show();
            return true;
        }else if(id == R.id.goBack){
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void deleteUser(){
        StringRequest stringRequest = new StringRequest(Request.Method.POST,
                "http://rafa.jantoniosr.com/registrar_usuario/eliminar_usuario.php", new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(getApplicationContext(), "USUARIO ELIMINADO", Toast.LENGTH_SHORT).show();

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), error.toString(), Toast.LENGTH_SHORT).show();
            }
        }){
            @Nullable
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> parametros=new HashMap<String, String>();

                parametros.put("usuario", getUser(archivos).replaceAll("\\s",""));

                return parametros;
            }
        };
        requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);

        goToMainView();
        finish();
    }

    public void goToChangePass(View view){
        Intent siguiente= new Intent(this,ChangePasswordActivity.class);
        startActivity(siguiente);
    }
}