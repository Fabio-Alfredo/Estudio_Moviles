package com.example.calculadora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var Button_Suma:Button
    private lateinit var Button_Resta:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bind()
        AddListener()
    }

    fun AddListener(){
        Button_Suma.setOnClickListener {
            var intent = Intent(this, SumaActivity::class.java)
            startActivity(intent)
        }

        Button_Resta.setOnClickListener {
            var intent = Intent(this, RestaActivity::class.java)
            startActivity(intent)
        }
    }

    fun bind(){
        Button_Suma=findViewById(R.id.Suma_Button)
        Button_Resta=findViewById(R.id.Resta_Button)
    }
}