package com.example.podrecznik

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

@Suppress("DEPRECATION")
class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, MainActivity::class.java).apply {
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
            })
        finish()
        }, LOADING_TIME)
    }

    companion object {
        private const val LOADING_TIME = 2000L // 2 sekundy
    }
}