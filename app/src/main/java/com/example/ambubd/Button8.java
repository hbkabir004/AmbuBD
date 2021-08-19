package com.example.ambubd;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Button8 extends AppCompatActivity {

    private WebView webview8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button8);
        webview8 =(WebView) findViewById(R.id.webviewId8);
        WebSettings webSettings = webview8.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webview8.setWebViewClient(new WebViewClient());

        webview8.loadUrl("https://www.facebook.com/pages/category/Health-Beauty/Khulna-City-Medical-College-Hospital-KCMCH-381598468986652/");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
