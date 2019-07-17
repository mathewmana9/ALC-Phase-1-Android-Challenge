package com.example.princelegend.alc_4_phase_1;

import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityB extends AppCompatActivity {
        private WebView webView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_b);
            webView = (WebView) findViewById(R.id.webView);
            webView.setWebViewClient(new MyWebViewClient());
            webView.getSettings().setJavaScriptEnabled(true);

            webView.getSettings().setAppCacheEnabled(true);
            webView.loadUrl("https://andela.com/alc");
            webView.setWebViewClient(new WebViewClient(){

                public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error){
                    handler.proceed();
                    //webView.loadUrl("file://android_asset/error.html");
                }
            });

        }
        private class MyWebViewClient extends WebViewClient {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view,String Url) {
                view.loadUrl("https://andela.com/alc");
                return (true);
            }
        }

}
