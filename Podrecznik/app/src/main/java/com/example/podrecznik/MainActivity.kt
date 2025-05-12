package com.example.podrecznik

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.podrecznik.lore.Lore
import com.example.podrecznik.magie.Magie
import com.example.podrecznik.rasy.Rasy
import com.example.podrecznik.wprowadzenie.Wprowadznie
import com.example.podrecznik.regiony_lokacje.Regiony_lokacje


class MainActivity : AppCompatActivity() {
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
        setContentView(R.layout.activity_main)
        linkBtnToActivity(R.id.btn_wprowadzenie, Intent(this, Wprowadznie::class.java))
        linkBtnToActivity(R.id.btn_rasy, Intent(this, Rasy::class.java))
        linkBtnToActivity(R.id.btn_regiony_lokacje, Intent(this, Regiony_lokacje::class.java))
        linkBtnToActivity(R.id.btn_magie, Intent(this, Magie::class.java))
        linkBtnToActivity(R.id.btn_lore, Intent(this, Lore::class.java))
        linkBtnToActivity(R.id.btn_about, Intent(this, About::class.java))

    }

}

