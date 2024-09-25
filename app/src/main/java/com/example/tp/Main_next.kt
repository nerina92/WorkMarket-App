package com.example.tp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class Main_next : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_next)
       val parametros = this.intent.extras
        val datos = parametros!!.getString("datos")

        //
    }
}