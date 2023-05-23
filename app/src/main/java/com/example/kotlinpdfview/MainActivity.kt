package com.example.kotlinpdfview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.barteksc.pdfviewer.PDFView

//import com.pspdfkit.configuration.activity.PdfActivityConfiguration
//import com.pspdfkit.ui.PdfActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val pdfView = findViewById<PDFView>(R.id.pdfview)
        pdfView.fromAsset("hello.pdf")
            .load()

    }
}