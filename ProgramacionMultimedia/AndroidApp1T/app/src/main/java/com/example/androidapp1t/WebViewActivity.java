package com.example.androidapp1t;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class WebViewActivity extends AppCompatActivity {
    private EditText et1;
    private ImageButton ib1;
    private Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        et1 =findViewById(R.id.txt_web);
        ib1=findViewById(R.id.goBack2);
        b1= findViewById(R.id.b1);
        ib1.setImageResource(R.mipmap.arrowleft);
        b1.setEnabled(false);
        et1.addTextChangedListener (new TextWatcher() {


            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence s, int i, int i1, int i2){
                checkField();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }

    private void checkField() {
        if (!et1.getText().toString().isEmpty()) {
            b1.setEnabled(true);
        } else {
            b1.setEnabled(false);
        }
    }
    public void navegar(View view){
        Intent i=new Intent(this, WebActivity.class);
        i.putExtra("sitioWeb",et1.getText().toString());
        startActivity(i);
    }

    public void goBack(View view) {
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }
}