package com.example.joaco.lab09;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;

import java.io.Console;

public class MainActivity extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = (WebView) findViewById(R.id.webview);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.loadUrl("http://demo.tutorialzine.com/2012/04/mobile-touch-gallery/");
        webView.setWebChromeClient(new WebChromeClient(){
            public void onConsoleMessage(String message){
                Log.d("Lab09", message);
            }
        });
        webView.addJavascriptInterface(new WebInterface(this), "Android");
    }

    @Override
    public void onBackPressed(){
        Log.d("App", "Back pressed  ");
        if(webView.canGoBack()){
            webView.goBack();
        }
    }
}
