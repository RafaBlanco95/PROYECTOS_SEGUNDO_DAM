package com.example.androidapp1t;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;


public class NewFunctionActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton bt1,bt2,bt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_function);
        bt1=findViewById(R.id.bt1);
        bt2=findViewById(R.id.bt2);
        bt3=findViewById(R.id.bt3);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);


    }

    public void goBack(View view) {
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.bt1:
                Intent i=new Intent(NewFunctionActivity.this, OnePlayer.class);
                startActivity(i);
                break;
            case R.id.bt2:
                Intent j=new Intent(NewFunctionActivity.this, TwoPlayers.class);
                startActivity(j);
                break;
            case R.id.bt3:
                goBack(getCurrentFocus());
                break;
            default:
                break;

        }
    }
}