package com.example.ambubd;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Button7 extends AppCompatActivity {

    private WebView webview7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button7);

        webview7=(WebView) findViewById(R.id.webviewId7);
        WebSettings webSettings = webview7.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webview7.setWebViewClient(new WebViewClient());

        webview7.loadUrl("https://bd.top10place.com/khulna-homoeopathic-medical-college-and-hospital-2099747102.html");

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
