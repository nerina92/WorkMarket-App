package com.example.tp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val campoDeTexto = findViewById<EditText>(R.id.editTextTextPersonName)

        button.setOnClickListener {
            val textoIngresado = campoDeTexto.text.toString()
            val intent = Intent(this, Main_next::class.java)
            intent.putExtra("nombre", textoIngresado)
            startActivity(intent)
        }
    }
}
