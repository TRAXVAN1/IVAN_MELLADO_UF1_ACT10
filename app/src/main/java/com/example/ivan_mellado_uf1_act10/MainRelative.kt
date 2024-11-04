package com.example.ivan_mellado_uf1_act10

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity

class MainRelative : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_relative)

        val btnCanviActivitat = findViewById<Button>(R.id.btnCanviActivitat)
        btnCanviActivitat.setOnClickListener {
            val intent = Intent(this, MainConstraint::class.java)
            startActivity(intent)
        }
    }
}