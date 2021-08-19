package com.example.ambubd;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Button4 extends AppCompatActivity {

    private WebView webview4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button4);
        webview4 =(WebView) findViewById(R.id.webviewId4);

        WebSettings webSettings = webview4.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webview4.setWebViewClient(new WebViewClient());

        webview4.loadUrl("https://www.facebook.com/pages/category/College---University/Ad-Din-Sakina-Medical-College-Jessore-309283682593800/");

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
