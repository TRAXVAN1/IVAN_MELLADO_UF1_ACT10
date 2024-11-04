package com.example.ivan_mellado_uf1_act10

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_linear)

        val etNom = findViewById<EditText>(R.id.etNom)
        val etCognom = findViewById<EditText>(R.id.etCognom)
        val etEdat = findViewById<EditText>(R.id.etEdat)
        val etUsuari = findViewById<EditText>(R.id.etUsuari)
        val etPassword = findViewById<EditText>(R.id.etPassword)

        val btnEnviar = findViewById<Button>(R.id.btnEnviar)
        btnEnviar.setOnClickListener {
            Toast.makeText(this, "Registre complet", Toast.LENGTH_SHORT).show()
        }

        val btnCanviActivitat = findViewById<Button>(R.id.btnCanviActivitat)
        btnCanviActivitat.setOnClickListener {
            val intent = Intent(this, MainRelative::class.java)
            startActivity(intent)  // Inicia RelativeActivity
        }
    }
}




