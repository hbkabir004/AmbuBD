package com.example.ambubd;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Button3 extends AppCompatActivity {

    private WebView webview3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button3);

        webview3 =(WebView) findViewById(R.id.webviewId3);

        WebSettings webSettings = webview3.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webview3.setWebViewClient(new WebViewClient());

        webview3.loadUrl("https://placesmap.net/BD/Sundarban-Medical-Institute-106715/");

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
