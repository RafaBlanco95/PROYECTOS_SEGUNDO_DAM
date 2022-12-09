package com.example.nextpotify;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class PlayerActivity extends AppCompatActivity {

 ImageView play, stop, repeat, next, previous, cover;
 MediaPlayer mp;
 int repetir = 2, posicion = 0, posicionLista=0;
 private final String[] items= {"Dos Besos Después", "Princesas", "Natural", "Agua Pasá", "Lose Yourself", "Till I Collapse", "Un Año", "Extraordinario"};
 MediaPlayer vectormp [] = new MediaPlayer [items.length];
 ListView lv1;
 TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
        play=findViewById(R.id.btn_play);
        stop=findViewById(R.id.btn_stop);
        repeat=findViewById(R.id.btn_repeat);
        next=findViewById(R.id.btn_after);
        previous=findViewById(R.id.btn_before);
        cover=findViewById(R.id.imageCover);
        lv1=findViewById(R.id.listViewCanciones);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(this,R.layout.list_item_song,items);
        lv1.setAdapter(myAdapter);
        tv1=findViewById(R.id.textView5);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap. ic_launcher);

        vectormp [0]=MediaPlayer.create(this,R.raw.dosbesosdespues);
        vectormp [1]=MediaPlayer.create(this,R.raw.princesas);
        vectormp [2]=MediaPlayer.create(this,R.raw.natural);
        vectormp [3]=MediaPlayer.create(this,R.raw.aguapasa);
        vectormp [4]=MediaPlayer.create(this,R.raw.loseyourself);
        vectormp [5]=MediaPlayer.create(this,R.raw.till);
        vectormp [6]=MediaPlayer.create(this,R.raw.unanio);
        vectormp [7]=MediaPlayer.create(this,R.raw.extraordinario);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                tv1.setText((String)lv1.getItemAtPosition(i));
                if(vectormp[posicion].isPlaying()) {

                    vectormp[posicion].pause();


                }

                posicion = i;
                if(vectormp[posicion] != null) {
                    vectormp[posicion].start();
                    if(posicion == 0){
                        cover.setImageResource(R.mipmap.portada1);
                    } else if(posicion == 1){
                        cover.setImageResource(R.mipmap.portada2);
                    }else if(posicion == 2){
                        cover.setImageResource(R.mipmap.portada3);
                    }else if(posicion == 3){
                        cover.setImageResource(R.mipmap.portada4);
                    }else if(posicion == 4){
                        cover.setImageResource(R.mipmap.portada5);
                    }else if(posicion == 5){
                        cover.setImageResource(R.mipmap.portada6);
                    }else if(posicion == 6){
                        cover.setImageResource(R.mipmap.portada7);
                    }else if(posicion == 7){
                        cover.setImageResource(R.mipmap.portada8);
                    }
                    play.setImageResource(R.mipmap.pause);
                }else{
                    vectormp[posicion].start();
                    if(posicion == 0){
                        cover.setImageResource(R.mipmap.portada1);
                    } else if(posicion == 1){
                        cover.setImageResource(R.mipmap.portada2);
                    }else if(posicion == 2){
                        cover.setImageResource(R.mipmap.portada3);
                    }else if(posicion == 3){
                        cover.setImageResource(R.mipmap.portada4);
                    }else if(posicion == 4){
                        cover.setImageResource(R.mipmap.portada5);
                    }else if(posicion == 5){
                        cover.setImageResource(R.mipmap.portada6);
                    }else if(posicion == 6){
                        cover.setImageResource(R.mipmap.portada7);
                    }else if(posicion == 7){
                        cover.setImageResource(R.mipmap.portada8);
                    }
                    play.setImageResource(R.mipmap.siguiente);
                }

            }
        });
    }

    public void playPause(View view){
        if(vectormp[posicion].isPlaying()){
            vectormp[posicion].pause();
            play.setImageResource(R.mipmap.siguiente);
            Toast.makeText(this, "Pausa", Toast.LENGTH_SHORT).show();
        } else {
            vectormp[posicion].start();
            if(posicion == 0){
                cover.setImageResource(R.mipmap.portada1);
            } else if(posicion == 1){
                cover.setImageResource(R.mipmap.portada2);
            }else if(posicion == 2){
                cover.setImageResource(R.mipmap.portada3);
            }else if(posicion == 3){
                cover.setImageResource(R.mipmap.portada4);
            }else if(posicion == 4){
                cover.setImageResource(R.mipmap.portada5);
            }else if(posicion == 5){
                cover.setImageResource(R.mipmap.portada6);
            }else if(posicion == 6){
                cover.setImageResource(R.mipmap.portada7);
            }else if(posicion == 7){
                cover.setImageResource(R.mipmap.portada8);
            }
            tv1.setText((String)lv1.getItemAtPosition(posicion));
            play.setImageResource(R.mipmap.pause);
            Toast.makeText(this, "Play", Toast.LENGTH_SHORT).show();

        }
    }
    public void stop(View view){
        if(vectormp[posicion] != null){
            vectormp[posicion].stop();
            vectormp [0]=MediaPlayer.create(this,R.raw.dosbesosdespues);
            vectormp [1]=MediaPlayer.create(this,R.raw.princesas);
            vectormp [2]=MediaPlayer.create(this,R.raw.natural);
            vectormp [3]=MediaPlayer.create(this,R.raw.aguapasa);
            vectormp [4]=MediaPlayer.create(this,R.raw.loseyourself);
            vectormp [5]=MediaPlayer.create(this,R.raw.till);
            vectormp [6]=MediaPlayer.create(this,R.raw.unanio);
            vectormp [7]=MediaPlayer.create(this,R.raw.extraordinario);
            posicion = 0;
            tv1.setText(R.string.player);
            play.setImageResource(R.mipmap.siguiente);
            cover.setImageResource(R.mipmap.headset);
            Toast.makeText(this, "Stop", Toast.LENGTH_SHORT).show();
        }
    }

    public void repeat(View view){
        if(repetir == 1){
            repeat.setImageResource(R.mipmap.ir);
            Toast.makeText(this, "No repetir", Toast.LENGTH_SHORT).show();
            vectormp[posicion].setLooping(false);
            repetir = 2;
        } else {
            repeat.setImageResource(R.mipmap.random);

            Toast.makeText(this, "Repetir", Toast.LENGTH_SHORT).show();
            vectormp[posicion].setLooping(true);
            repetir = 1;
        }
    }

    public void previous(View view){
        if(posicion >= 1){
            if(vectormp[posicion].isPlaying()){
                vectormp[posicion].stop();
                vectormp [0]=MediaPlayer.create(this,R.raw.dosbesosdespues);
                vectormp [1]=MediaPlayer.create(this,R.raw.princesas);
                vectormp [2]=MediaPlayer.create(this,R.raw.natural);
                vectormp [3]=MediaPlayer.create(this,R.raw.aguapasa);
                vectormp [4]=MediaPlayer.create(this,R.raw.loseyourself);
                vectormp [5]=MediaPlayer.create(this,R.raw.till);
                vectormp [6]=MediaPlayer.create(this,R.raw.unanio);
                vectormp [7]=MediaPlayer.create(this,R.raw.extraordinario);
                posicion--;
                if(posicion == 0){
                    cover.setImageResource(R.mipmap.portada1);
                } else if(posicion == 1){
                    cover.setImageResource(R.mipmap.portada2);
                }else if(posicion == 2){
                    cover.setImageResource(R.mipmap.portada3);
                }else if(posicion == 3){
                    cover.setImageResource(R.mipmap.portada4);
                }else if(posicion == 4){
                    cover.setImageResource(R.mipmap.portada5);
                }else if(posicion == 5){
                    cover.setImageResource(R.mipmap.portada6);
                }else if(posicion == 6){
                    cover.setImageResource(R.mipmap.portada7);
                }else if(posicion == 7){
                    cover.setImageResource(R.mipmap.portada8);
                }
                vectormp[posicion].start();
                tv1.setText((String)lv1.getItemAtPosition(posicion));
            } else {
                posicion--;
                tv1.setText((String)lv1.getItemAtPosition(posicion));
                play.setImageResource(R.mipmap.siguiente);
                if(posicion == 0){
                    cover.setImageResource(R.mipmap.portada1);
                } else if(posicion == 1){
                    cover.setImageResource(R.mipmap.portada2);
                }else if(posicion == 2){
                    cover.setImageResource(R.mipmap.portada3);
                }else if(posicion == 3){
                    cover.setImageResource(R.mipmap.portada4);
                }else if(posicion == 4){
                    cover.setImageResource(R.mipmap.portada5);
                }else if(posicion == 5){
                    cover.setImageResource(R.mipmap.portada6);
                }else if(posicion == 6){
                    cover.setImageResource(R.mipmap.portada7);
                }else if(posicion == 7){
                    cover.setImageResource(R.mipmap.portada8);
                }
            }
        } else {
            Toast.makeText(this, "No hay más canciones", Toast.LENGTH_SHORT).show();
        }
    }

    public void next(View view){
        if(posicion < vectormp.length -1){
            if(vectormp[posicion].isPlaying()){
                vectormp[posicion].stop();
                vectormp [0]=MediaPlayer.create(this,R.raw.dosbesosdespues);
                vectormp [1]=MediaPlayer.create(this,R.raw.princesas);
                vectormp [2]=MediaPlayer.create(this,R.raw.natural);
                vectormp [3]=MediaPlayer.create(this,R.raw.aguapasa);
                vectormp [4]=MediaPlayer.create(this,R.raw.loseyourself);
                vectormp [5]=MediaPlayer.create(this,R.raw.till);
                vectormp [6]=MediaPlayer.create(this,R.raw.unanio);
                vectormp [7]=MediaPlayer.create(this,R.raw.extraordinario);
                posicion++;
                vectormp[posicion].start();
                tv1.setText((String)lv1.getItemAtPosition(posicion));
                if(posicion == 0){
                    cover.setImageResource(R.mipmap.portada1);
                } else if(posicion == 1){
                    cover.setImageResource(R.mipmap.portada2);
                }else if(posicion == 2){
                    cover.setImageResource(R.mipmap.portada3);
                }else if(posicion == 3){
                    cover.setImageResource(R.mipmap.portada4);
                }else if(posicion == 4){
                    cover.setImageResource(R.mipmap.portada5);
                }else if(posicion == 5){
                    cover.setImageResource(R.mipmap.portada6);
                }else if(posicion == 6){
                    cover.setImageResource(R.mipmap.portada7);
                }else if(posicion == 7){
                    cover.setImageResource(R.mipmap.portada8);
                }
            } else {
                posicion++;
                tv1.setText((String)lv1.getItemAtPosition(posicion));
                play.setImageResource(R.mipmap.siguiente);
                if(posicion == 0){
                    cover.setImageResource(R.mipmap.portada1);
                } else if(posicion == 1){
                    cover.setImageResource(R.mipmap.portada2);
                }else if(posicion == 2){
                    cover.setImageResource(R.mipmap.portada3);
                }else if(posicion == 3){
                    cover.setImageResource(R.mipmap.portada4);
                }else if(posicion == 4){
                    cover.setImageResource(R.mipmap.portada5);
                }else if(posicion == 5){
                    cover.setImageResource(R.mipmap.portada6);
                }else if(posicion == 6){
                    cover.setImageResource(R.mipmap.portada7);
                }else if(posicion == 7){
                    cover.setImageResource(R.mipmap.portada8);
                }
            }
        } else {
            Toast.makeText(this, "No hay más canciones", Toast.LENGTH_SHORT).show();
        }
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