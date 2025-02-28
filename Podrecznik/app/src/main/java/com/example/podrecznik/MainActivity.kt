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


    }
}