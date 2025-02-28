package com.example.podrecznik

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.view.View
import android.content.Intent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var buttonWprowadznie = findViewById<Button>(R.id.btn_wprowadzenie)
        buttonWprowadznie.setOnClickListener {
            val intent = Intent(this, Wprowadznie::class.java)
            startActivity(intent)
        }
        var buttonRasy = findViewById<Button>(R.id.btn_rasy)
        buttonRasy.setOnClickListener {
            val intent = Intent(this, Rasy::class.java)
            startActivity(intent)
        }
        var buttonRegiony_lokacje = findViewById<Button>(R.id.btn_regiony_lokacje)
        buttonRegiony_lokacje.setOnClickListener {
            val intent = Intent(this, Regiony_lokacje::class.java)
            startActivity(intent)
        }
        var buttonMagie = findViewById<Button>(R.id.btn_magie)
        buttonMagie.setOnClickListener {
            val intent = Intent(this, Magie::class.java)
            startActivity(intent)
        }
        var buttonLore = findViewById<Button>(R.id.btn_lore)
        buttonLore.setOnClickListener {
            val intent = Intent(this, Lore::class.java)
            startActivity(intent)
        }

    }
}
