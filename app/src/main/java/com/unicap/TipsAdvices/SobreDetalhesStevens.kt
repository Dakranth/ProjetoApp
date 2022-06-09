package com.unicap.TipsAdvices

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SobreDetalhesStevens : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sobre_detalhes_stevens)

        val textView: TextView = findViewById(R.id.text_image1)
        val bundle: Bundle? = intent.extras
        val texto1: String? = bundle?.getString("text")
        texto1.also { textView.text = it }
    }
}