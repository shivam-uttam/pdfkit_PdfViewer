package com.example.kotlinpdfview

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pspdfkit.configuration.activity.PdfActivityConfiguration
import com.pspdfkit.ui.PdfActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val url = Uri.parse("file:///android_asset/hello.pdf")
        val config = PdfActivityConfiguration.Builder(this).build()
        PdfActivity.showDocument(this, url, config)
    }
}