package com.example.nextpotify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
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

import androidx.annotation.Nullable;
import android.widget.EditText;

import java.util.HashMap;
import java.util.Map;

public class RegisterActivity extends AppCompatActivity {
    RequestQueue requestQueue;
    EditText edtName1;
    EditText edtPass;
    EditText edtPass2;
    ImageView iw1;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        edtName1=findViewById(R.id.usuarioRegistro);
        edtPass=findViewById(R.id.registerPass);
        edtPass2=findViewById(R.id.editTextTextPassword2);
        iw1=findViewById(R.id.nextButtonRegister);
        iw1.setEnabled(false);
        tv1=findViewById(R.id.passWordCheck);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap. ic_launcher);

        edtPass2.addTextChangedListener (new TextWatcher() {
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
        edtPass.addTextChangedListener (new TextWatcher() {
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

    public void newUser(View view){
        StringRequest stringRequest = new StringRequest(Request.Method.POST, "http://rafa.jantoniosr.com/registrar_usuario/insertar_usuario.php", new
                Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Toast.makeText(getApplicationContext(), "REGISTRO COMPLETADO", Toast.LENGTH_SHORT).show();
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
                parametros.put("usuario", edtName1.getText().toString());
                parametros.put("pass", edtPass.getText().toString());

                return parametros;
            }
        };
        requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
        goToLogin();
    }

    private void checkRequiredFields() {
        if (edtPass.getText().toString().equals(edtPass2.getText().toString())) {
            iw1.setEnabled(true);
            tv1.setText("");
            iw1.setImageResource(R.mipmap.siguiente);
        } else {
            iw1.setEnabled(false);
        }
    }

    public void goToLogin(){
        Intent siguiente= new Intent(this,LoginActivity.class);
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
}
