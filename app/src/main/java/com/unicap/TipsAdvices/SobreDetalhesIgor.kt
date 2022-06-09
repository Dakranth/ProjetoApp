package com.unicap.TipsAdvices

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class SobreDetalhesIgor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sobre_detalhes_igor)

        val imageView:ImageView = findViewById(R.id.image_sobre_detalhes)
        val textView: TextView = findViewById(R.id.text_image1)
        val bundle: Bundle? = intent.extras
        val imageId: Int? = bundle?.getInt("image1")
        val texto1: String? = bundle?.getString("text")
        if (imageId != null) {
            imageView.setImageResource(imageId)
        }
        texto1.also { textView.text = it }
    }
}