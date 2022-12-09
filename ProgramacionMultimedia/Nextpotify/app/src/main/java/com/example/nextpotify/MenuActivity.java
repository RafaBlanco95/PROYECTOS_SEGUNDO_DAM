package com.example.nextpotify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {
    ImageView iv1;
    ImageView iv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        iv1=findViewById(R.id.profileImage);
        iv2=findViewById(R.id.playerImage);
    }

    public void goToProfile(View view){
        Intent siguiente= new Intent(this,MyProfileActivity.class);
        startActivity(siguiente);
    }

    public void goToPlayer(View view){
        Intent siguiente= new Intent(this,PlayerActivity.class);
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