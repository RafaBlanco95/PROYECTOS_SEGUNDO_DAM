package com.example.androidapp1t;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;



public class AlumnListActivity extends Activity {

    private TextView tv1;
    private ListView lv1;
    private ImageButton ib1;
    private final String[] names= {"Luis Alberto Barceló Lores", "Rafael Jaime Blanco Aranda ", "Daniel Consegliere Escriche",
            "Alejandro Falcón Carrión", "Miriam Fernández Martínez", "Manuel Fernández Niebla", "José Manuel Gamboa Montilla",
            "Julio García Molina","Juan Manuel Gil Medina", "Manuel Gutiérrez González", "Enrique Hurtado Justicia",
            "Julián Lahoz Rodriguez", "Christian Lobón Sevilla", "Santiago López Arredondo", "Javier López Guillén",
            "Pablo Marquínez Jiménez", "Raúl Ollero Moreno", "David Palacios Fontecha", "Alba Parrón Pérez", "Ignacio Pérez Sánchez",
            "Marcos Retamero Orovio", "Manuel Rodríguez Guillén","José Manuel Rodríguez Machado", "Iván Ruiz Navarro",
            "Fernando Tejero Fierro", "Javier Treig Gómez", "Tomás Yañez Quero"};
    private final String[] grades={"10","10","9.5","10", "9.8", "9.5","9.9","9.4","9.8","9.2","9.3","9.1","9.6","10","9.3","9.1","9.8",
            "9.6","9.4","9.0","9.2","9.1","9.0","9.4", "9.9","9.5","9.5"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alumn_list);
        tv1=findViewById(R.id.textView1);
        lv1=findViewById(R.id.AlumnList);
        ib1=findViewById(R.id.alumnListGoBack);

        ib1.setImageResource(R.mipmap.arrowleft);

        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,R.layout.list_item_dam, names);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                tv1.setText("La nota de " + lv1.getItemAtPosition(i) + " es " + grades[i]);
            }
        });
    }

    public void goBack(View view) {
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }
}