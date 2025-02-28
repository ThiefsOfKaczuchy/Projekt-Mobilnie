package com.example.podrecznik.regiony_lokacje

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.podrecznik.R
import com.example.podrecznik.regiony_lokacje.opisy.Region_lokacja_aratja
import com.example.podrecznik.regiony_lokacje.opisy.Region_lokacja_iratia
import com.example.podrecznik.regiony_lokacje.opisy.Region_lokacja_ziemia

class Regiony_lokacje : AppCompatActivity() {
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
        setContentView(R.layout.activity_regiony_lokacje)

        linkBtnToActivity(R.id.btn_region_lokacja_ziemia, Intent(this, Region_lokacja_ziemia::class.java))
        linkBtnToActivity(R.id.btn_region_lokacja_iratia, Intent(this, Region_lokacja_iratia::class.java))
        linkBtnToActivity(R.id.btn_region_lokacja_aratja, Intent(this, Region_lokacja_aratja::class.java))
    }
}