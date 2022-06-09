package com.unicap.TipsAdvices

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Sobre : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sobre)
    }
    val s1 = "Olá, me chamo Igor, tenho 25 anos e sou estudante de Ciências da Computação na " +
            "Universidade Católica de Pernambuco. \n\n" +
            "Atualmente estou no 5ª período e a procura de um estágio para colocar tudo o que aprendi em prática. \n\n" +
            "Linguagens e tecnologias que aprendi e que ainda ando aprendendo: \n" +
            "Java, Spring Boot, HTML, CSS, JavaScript, Kotlin. \n\n" +
            "Alguns de meus hobbies: \n" +
            "Jogar, assistir a filmes e séries e aprender música."

    val s2 = "Olá, me chamo Stevens wendell, tenho 22 anos e sou estudante de Ciências da Computação na " +
            "Universidade Católica de Pernambuco. \n\nAtualmente venho focado mais na área fullStack, onde ja vi  "+
            "algumas linguagens de programação, de marcação e alguns frameworks, como por exemplo:"+
            "\n\n-java, com SpringBoot para criação de API;\n-Html, JS e CSS para criação front-end;"+
            "\n-Um pouco de TS utilizando Angular. \n\nNão tenho um hobbie preferido, gosto de fazer de tudo um pouco."+
            " Curto jogar, sair, beber, assistir..."

    fun changeScreen(view: View) {
        val intent = Intent(this@Sobre, SobreDetalhesIgor::class.java)
        intent.putExtra("image1", R.drawable.ig)
        intent.putExtra("text", s1)
        startActivity(intent)
    }
    fun changeScreen2(view: View) {
        val intent = Intent(this@Sobre, SobreDetalhesStevens::class.java)
        intent.putExtra("image1", R.drawable.agu)
        intent.putExtra("text", s2)
        startActivity(intent)
    }
}





