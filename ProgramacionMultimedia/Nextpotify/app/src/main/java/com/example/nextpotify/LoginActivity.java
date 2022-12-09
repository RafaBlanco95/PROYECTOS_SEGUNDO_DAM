package com.example.nextpotify;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.widget.EditText;

import java.io.IOException;
import java.io.OutputStreamWriter;


public class LoginActivity extends AppCompatActivity {
    RequestQueue requestQueue;
    EditText edtName;
    EditText edtPass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap. ic_launcher);
        edtName=findViewById(R.id.usuarioInicio);
        edtPass=findViewById(R.id.editTextTextPassword);


    }
    public void checkLogin(View view){

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest("http://rafa.jantoniosr.com/registrar_usuario/buscar_usuario.php?usuario="+edtName.getText(), new
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
                        if(user.equals(edtName.getText().toString()) && password.equals(edtPass.getText().toString())){

                         Toast.makeText(getApplicationContext(), "USUARIO Y CONTRASEÑA CORRECTOS", Toast.LENGTH_SHORT).show();
                            saveUser();
                            goToMenu();
                        }else{
                            Toast.makeText(getApplicationContext(), "USUARIO O CONTRASEÑA INCORRECTOS", Toast.LENGTH_SHORT).show();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), "USUARIO O CONTRASEÑA INCORRECTOS", Toast.LENGTH_SHORT).show();
            }
        }
        );
        requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(jsonArrayRequest);

    }
    public void goToMenu(){
        Intent siguiente= new Intent(this,MenuActivity.class);
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

    public void saveUser(){
        try {
            OutputStreamWriter archivo = new OutputStreamWriter(openFileOutput("user.txt", Activity.MODE_PRIVATE));
            archivo.write(edtName.getText().toString());
            archivo.flush();
            archivo.close();
        }catch (IOException e){
        }


    }
}