package com.example.nextpotify;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ChangePasswordActivity extends AppCompatActivity {
    RequestQueue requestQueue;
    EditText currPass;
    EditText newPass1;
    EditText newPass2;
    ImageView iw1;
    TextView username;
    TextView tv1;
    String [] archivos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);
        currPass=findViewById(R.id.currentPassword);
        newPass1=findViewById(R.id.editTextTextPassword2);
        newPass2=findViewById(R.id.editTextTextPassword3);
        username=findViewById(R.id.textView2);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap. ic_launcher);
        archivos=fileList();
        iw1=findViewById(R.id.cambiarContraseñaButton);
        username.setText(getUser(archivos));
        tv1=findViewById(R.id.textView3);

        newPass1.addTextChangedListener (new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence s, int i, int i1, int i2){
                tv1.setText(R.string.contraseñas_diferentes);
                iw1.setImageResource(R.mipmap.pausa);
                checkRequiredFields();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        newPass2.addTextChangedListener (new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence s, int i, int i1, int i2){
                iw1.setImageResource(R.mipmap.pausa);
                tv1.setText(R.string.contraseñas_diferentes);
                checkRequiredFields();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
    private void checkRequiredFields() {
        if (newPass1.getText().toString().equals(newPass2.getText().toString())) {
            iw1.setEnabled(true);
            tv1.setText("");
            iw1.setImageResource(R.mipmap.siguiente);
        } else {
            iw1.setEnabled(false);
        }
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

    private boolean archivoExiste(String archivos [], String nombreArchivo){
        for(int i = 0; i < archivos.length; i++){
            if(nombreArchivo.equals(archivos[i])){
                return true;
            }
        }
        return false;
    }
    public void goToProfile(){
        Intent siguiente= new Intent(this,MyProfileActivity.class);
        startActivity(siguiente);
    }

    public void checkOldPass(View view){


        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest("http://rafa.jantoniosr.com/registrar_usuario/buscar_usuario_contraseña.php?pass="+currPass.getText(), new
                Response.Listener<JSONArray>() {

                    @Override
                    public void onResponse(JSONArray response) {
                        String user="";
                        String password="";

                        JSONObject jsonObject = null;
                        for (int i = 0; i < response.length(); i++) {
                            try {
                                jsonObject = response.getJSONObject(i);
                                user=jsonObject.getString("usuario");
                                password=jsonObject.getString("pass");

                            } catch (JSONException e) {
                                Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        }
                        if(user.equals(getUser(archivos).replaceAll("\\s",""))){


                            updatePass();

                        }else{
                            Toast.makeText(getApplicationContext(), "CONTRASEÑA ACTUAL INCORRECTA", Toast.LENGTH_SHORT).show();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), "CONTRASEÑA INCORRECTA", Toast.LENGTH_SHORT).show();
            }
        }
        );
        requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(jsonArrayRequest);



    }

    public void updatePass(){
        StringRequest stringRequest = new StringRequest(Request.Method.POST, "http://rafa.jantoniosr.com/registrar_usuario/editar_usuario.php", new
                Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Toast.makeText(getApplicationContext(), "CONTRASEÑA ACTUALIZADA", Toast.LENGTH_SHORT).show();
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
//ESTOS SON LAS $VARIABLES DEL MICROSERVICIO EN PHP
                parametros.put("pass1", currPass.getText().toString());
                parametros.put("pass2", newPass1.getText().toString());
                return parametros;
            }
        };
        requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
        goToProfile();
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
}