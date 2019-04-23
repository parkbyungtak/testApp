package kr.hyperlink.webviewtest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.webkit.WebView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)


        var myWebView = findViewById<WebView>(R.id.myWebView)

        myWebView.settings.javaScriptEnabled = true
        myWebView.settings.domStorageEnabled = true

        myWebView.loadUrl("https://www.google.com/")


    }
}
