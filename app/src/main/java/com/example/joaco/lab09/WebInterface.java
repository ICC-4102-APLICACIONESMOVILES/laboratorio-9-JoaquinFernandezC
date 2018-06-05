package com.example.joaco.lab09;

import android.app.Activity;
import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

public class WebInterface {
    Context mcontext;

    WebInterface(Context c){
        mcontext = c;
    }

    @JavascriptInterface
    public void onFinish(){
        ((Activity)mcontext).finish();
    }
}
