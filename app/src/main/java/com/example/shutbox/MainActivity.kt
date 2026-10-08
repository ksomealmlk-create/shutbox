package com.example.shutbox

import android.app.Activity
import android.os.Bundle
import android.webkit.WebView

class MainActivity : Activity() {
    private lateinit var w: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        w = WebView(this)
        w.settings.javaScriptEnabled = true
        w.settings.domStorageEnabled = true
        w.settings.mediaPlaybackRequiresUserGesture = false
        w.loadUrl("file:///android_asset/index.html")
        setContentView(w)
    }

    override fun onPause() {
        super.onPause()
        w.onPause()
    }

    override fun onResume() {
        super.onResume()
        w.onResume()
    }
}
