package com.example.podrecznik.rasy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.podrecznik.R
import com.example.podrecznik.rasy.opisy.Rasa_aratyjczycy
import com.example.podrecznik.rasy.opisy.Rasa_czlowiek
import com.example.podrecznik.rasy.opisy.Rasa_heneri
import com.example.podrecznik.rasy.opisy.Rasa_iratyjczycy


class Rasy : AppCompatActivity() {
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
        setContentView(R.layout.activity_rasy)

        linkBtnToActivity(R.id.btn_rasa_czlowiek, Intent(this, Rasa_czlowiek::class.java))
        linkBtnToActivity(R.id.btn_rasa_iratyjczycy, Intent(this, Rasa_iratyjczycy::class.java))
        linkBtnToActivity(R.id.btn_rasa_heneri, Intent(this, Rasa_heneri::class.java))
        linkBtnToActivity(R.id.btn_rasa_aratyjczycy, Intent(this, Rasa_aratyjczycy::class.java))

    }
}