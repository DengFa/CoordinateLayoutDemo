package com.support.android.designlibdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.NestedScrollView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class WebviewFragment extends Fragment {

    private WebView mWebView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        NestedScrollView rv = (NestedScrollView) inflater.inflate(
                R.layout.fragment_webview, container, false);
        mWebView = (WebView) rv.findViewById(R.id.webview);
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mWebView.loadUrl("https://m.baidu.com");
        return rv;
    }

}
