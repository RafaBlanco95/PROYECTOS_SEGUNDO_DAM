package com.example.androidapp1t;




import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class CalcActivity extends AppCompatActivity {
    private EditText et1;
    private EditText et2;
    private TextView tv1;
    private Spinner sp1;
    private Button b1;
    private ImageButton ib1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        et1= findViewById(R.id.first_num);
        et2= findViewById(R.id.second_num);
        tv1= findViewById(R.id.result);
        sp1= findViewById(R.id.spinner);
        b1= findViewById(R.id.calcButton);
        b1.setEnabled(false);
        ib1=findViewById(R.id.calcGoBack);



        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this, R.array.operaciones, R.layout.spinnerlayout);
        sp1.setAdapter(adapter);
        et1.addTextChangedListener (new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                checkRequiredFields();
            }

            @Override
            public void onTextChanged(CharSequence s, int i, int i1, int i2){
                checkRequiredFields();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        et2.addTextChangedListener (new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence s, int i, int i1, int i2){
                checkRequiredFields();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    private void checkRequiredFields() {
        if (!et1.getText().toString().isEmpty() && !et2.getText().toString().isEmpty()) {
            b1.setEnabled(true);
        } else {
            b1.setEnabled(false);
        }
    }



    public void calcular(View view){
        String var1= et1.getText().toString();
        String var2= et2.getText().toString();

        double num1=Double.parseDouble(var1);
        double num2=Double.parseDouble(var2);

        int selection= sp1.getSelectedItemPosition();

        String result;
        switch (selection) {

            case 0: {
                double suma = num1 + num2;
                result = String.valueOf(suma);
                tv1.setText(result);
                break;
            }
            case 1: {
                double resta = num1 - num2;
                result = String.valueOf(resta);
                tv1.setText(result);
                break;
            }
            case 2: {
                double multiplicar = num1 * num2;
                result = String.valueOf(multiplicar);
                tv1.setText(result);
                break;
            }
            case 3: {
                if (num2==0){
                    Toast toast=Toast.makeText(this,"Un número no es divisible por 0",Toast.LENGTH_LONG);
                    toast.show();
                    tv1.setText("Modifique el valor del divisor");
                }else{
                    double division = num1 / num2;
                    result = String.valueOf(division);
                    tv1.setText(result);
                }
                break;
            }
        }


    }
    public void goBack(View view){
        Intent anterior= new Intent(this, MainActivity.class);
        startActivity(anterior);

    }


}