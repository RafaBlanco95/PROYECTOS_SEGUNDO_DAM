package com.example.nextpotify;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    ImageView iv1;
    ImageView iv2;
    ImageView iv3;
    SoundPool sp;
    int sonidoDeReproduccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap. ic_launcher);
        iv1=findViewById(R.id.imageView12);
        iv2=findViewById(R.id.imageView15);
        iv3=findViewById(R.id.imageView16);
        sp=new SoundPool(1, AudioManager.STREAM_MUSIC,1);
        sonidoDeReproduccion=sp.load(this,R.raw.coin,1);

    }

    public void AudioSoundPool (View view){
        sp.play(sonidoDeReproduccion , 1,1, 1, 0, 0);
    }
    public void AudioMediaPlayer (View view){
        MediaPlayer mp = MediaPlayer. create(this, R.raw.coin);
        mp.start() ;
    }

    public void goToLogin(View view){
        Intent siguiente= new Intent(this,LoginActivity.class);
        startActivity(siguiente);
    }

    public void goToRegister(View view){
        Intent siguiente= new Intent(this,RegisterActivity.class);
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