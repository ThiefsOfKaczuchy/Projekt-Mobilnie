package com.example.podrecznik.lore

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.podrecznik.R
import com.example.podrecznik.lore.historie.Historia_Cesarzowej
import com.example.podrecznik.lore.historie.Wielka_Wojna

class Lore : AppCompatActivity() {
    // linkBtnToActivity(id: R.id.nazwa_id, intent: Intent(this, nazwa_aktywności::class.java))
    private fun linkBtnToActivity(id: Int, intent: Intent){
        val btn = findViewById<Button>(id)
        btn.setOnClickListener {
            startActivity(intent)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lore)
        linkBtnToActivity(R.id.btn_historia_cesarzowej, Intent(this, Historia_Cesarzowej::class.java))
        linkBtnToActivity(R.id.btn_wielka_wojna,Intent(this, Wielka_Wojna::class.java))

    }
}