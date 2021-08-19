package com.example.ambubd;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Button9 extends AppCompatActivity {

    private WebView webview9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button9);

        webview9 =(WebView) findViewById(R.id.webviewId9);
        WebSettings webSettings = webview9.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webview9.setWebViewClient(new WebViewClient());

        webview9.loadUrl("https://www.facebook.com/pages/category/Medical-Company/Khulna-Unani-Medical-College-HospitalKhulna-1052892358086858/");

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
