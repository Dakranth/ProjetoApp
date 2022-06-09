package com.unicap.TipsAdvices

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.unicap.TipsAdvices.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val texto = "Make choices and dont look back."
        binding.btnPrincipal.setOnClickListener() {
            binding.textoPrincipal.text = texto
        }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.menu_sobre -> {
                val intent = Intent(this@MainActivity, Sobre::class.java)
                startActivity(intent)
                true
            }
            else -> {
                false
            }
        }
        return super.onOptionsItemSelected(item)
    }
//    fun onClick(view: View?) {
//        when(view?.id){
//            binding.btnPrincipal -> {
//                binding.textoPrincipal.text = "teste"
//            }
//        }
//    }

}
