package com.example.ambubd;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Button6 extends AppCompatActivity {

    private WebView webview6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button6);
        webview6 =(WebView) findViewById(R.id.webviewId6);

        WebSettings webSettings = webview6.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webview6.setWebViewClient(new WebViewClient());

        webview6.loadUrl("https://www.facebook.com/pages/Khulna-Medical-InstituteKMI/629586560457611");

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
