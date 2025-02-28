package com.example.podrecznik.magie

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.podrecznik.R
import com.example.podrecznik.magie.opisy.Magia_astralna
import com.example.podrecznik.magie.opisy.Magia_ognia
import com.example.podrecznik.magie.opisy.Magia_wiatru
import com.example.podrecznik.magie.opisy.Magia_wody
import com.example.podrecznik.magie.opisy.Magia_wzmocnienia

class Magie : AppCompatActivity() {
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
        setContentView(R.layout.activity_magie)
        linkBtnToActivity(R.id.btn_magia_astralna, Intent(this, Magia_astralna::class.java))
        linkBtnToActivity(R.id.btn_magia_ognia, Intent(this, Magia_ognia::class.java))
        linkBtnToActivity(R.id.btn_magia_wiatru, Intent(this, Magia_wiatru::class.java))
        linkBtnToActivity(R.id.btn_magia_wody, Intent(this, Magia_wody::class.java))
        linkBtnToActivity(R.id.btn_magia_wzmocnienia, Intent(this, Magia_wzmocnienia::class.java))

    }
}