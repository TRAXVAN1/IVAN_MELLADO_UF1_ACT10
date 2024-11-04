package com.example.ivan_mellado_uf1_act10

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainConstraint : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_constraint)  // Asegúrate de que el nombre de tu layout sea correcto

        val btnCanviActivitat = findViewById<Button>(R.id.btnCanviActivitat)
        btnCanviActivitat.setOnClickListener {
            val intent = Intent(this, MainLinear::class.java)
            startActivity(intent)  // Inicia LinearActivity
        }
    }
}
