package com.example.deeplinking

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class link : AppCompatActivity() {
    private lateinit var uri: Uri

    private val Tag="link"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_link)

        uri   = intent.data!!;

        if (uri != null) {
            // Process the deep link data
            val scheme = uri.scheme;
            val host = uri.host;
            Log.d(Tag,"$scheme")
            Log.d(Tag,"$host")
        }
    }
}