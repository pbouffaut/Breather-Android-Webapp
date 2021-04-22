package com.example.breatherweb;

import android.os.Build;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends FragmentActivity {
    private WebView mWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    // These lines makes the status bar transparent and the website will take up the whole length of the display, Works for Android versions post-KitKat; uncomment if needed
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
    Window w = getWindow(); // in Activity’s onCreate() for instance
    w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
    }
    //

        mWebView = (WebView) findViewById(R.id.webview);
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mWebView.getSettings().setUseWideViewPort(true);
        mWebView.getSettings().setLoadWithOverviewMode(true);
        mWebView.getSettings().setUserAgentString("Mozilla/5.0 (Linux; U;` Android 2.0; en-us; Droid Build/ESD20) AppleWebKit/530.17 (KHTML, like Gecko) Version/4.0 Mobile Safari/530.17");
        mWebView.loadUrl("https://breather.com"); //change the url to display your website
/*
    mWebView.setWebViewClient(new WebViewClient(){
      @Override
      public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
          super.shouldOverrideUrlLoading(view, request);
          return super.shouldOverrideUrlLoading(view, request);
      }
    });
*/
    }

}