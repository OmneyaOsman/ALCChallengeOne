package com.omni.alcchallengeone.features.about

import android.net.http.SslError
import android.os.Bundle
import android.webkit.SslErrorHandler
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.omni.alcchallengeone.R
import kotlinx.android.synthetic.main.activity_about.*
import kotlinx.android.synthetic.main.toolbar_layout.*

const val ABOUT_URL = "https://andela.com/alc/"

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        about_web_view.webViewClient = object : WebViewClient() {
            override fun onReceivedSslError(view: WebView?, handler: SslErrorHandler?, error: SslError?) {
                handler?.proceed()
            }
        }
        about_web_view.settings.javaScriptEnabled = true
        about_web_view.loadUrl(ABOUT_URL)
    }


}
