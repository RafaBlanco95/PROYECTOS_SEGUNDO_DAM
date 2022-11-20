package com.example.androidapp1t;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;


public class WebActivity extends AppCompatActivity {
    private WebView wv1;
    private ImageButton ib1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        wv1=findViewById(R.id.webView);
        ib1=findViewById(R.id.goBackWeb);
        String url= getIntent().getStringExtra("sitioWeb");
        wv1.setWebViewClient(new WebViewClient());
        wv1.loadUrl("https://" + url);
        ib1.setImageResource(R.mipmap.arrowleft);

    }
    public void cerrar(View view){

        finish();
    }
    public void goBack(View view) {
        Intent anterior = new Intent(this, WebViewActivity.class);
        startActivity(anterior);
    }
}