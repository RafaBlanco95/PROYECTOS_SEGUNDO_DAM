package com.example.androidapp1t;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void goToCalculator(View view){
        Intent siguiente= new Intent(this,CalcActivity.class);
        startActivity(siguiente);
    }

    public void goToList(View view){
        Intent next= new Intent(this, AlumnListActivity.class);
        startActivity(next);
    }

    public void goToWeb(View view){
        Intent next= new Intent(this, WebViewActivity.class);
        startActivity(next);
    }

    public void goToNew(View view){
        Intent next= new Intent(this, NewFunctionActivity.class);
        startActivity(next);
    }
}