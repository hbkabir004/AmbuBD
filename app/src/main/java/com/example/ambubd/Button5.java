package com.example.ambubd;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Button5 extends AppCompatActivity {
    private WebView webview5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button5);

        webview5 =(WebView) findViewById(R.id.webviewId5);
        WebSettings webSettings = webview5.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webview5.setWebViewClient(new WebViewClient());

        webview5.loadUrl("https://en.wikipedia.org/wiki/Jessore_Medical_College");

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
