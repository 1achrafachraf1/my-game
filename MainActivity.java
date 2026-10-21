package com.rh.prismblocks;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.view.View;
import android.graphics.Color;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity {
  @Override public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getWindow().setStatusBarColor(Color.rgb(16,19,38));
    getWindow().setNavigationBarColor(Color.rgb(16,19,38));
    getWindow().getDecorView().setSystemUiVisibility(0);
    WebView web = new WebView(this);
    web.setBackgroundColor(Color.rgb(16,19,38));
    WebSettings s = web.getSettings();
    s.setJavaScriptEnabled(true);
    s.setDomStorageEnabled(true);
    s.setAllowFileAccess(true);
    web.setOverScrollMode(View.OVER_SCROLL_NEVER);
    web.loadUrl("file:///android_asset/index.html");
    setContentView(web);
  }
  @Override public void onBackPressed() { super.onBackPressed(); }
}