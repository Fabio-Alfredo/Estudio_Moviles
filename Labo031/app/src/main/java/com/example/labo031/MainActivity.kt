package com.example.labo031

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var ImageFiveCent:ImageView
    private lateinit var ImageTenCent:ImageView
    private lateinit var Num_diner:TextView

    var data =0f
    var cash=0f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bin()
        addLIstener()
    }

     fun addLIstener(){

         ImageFiveCent.setOnClickListener {
             data = data+5

             cash=(data)/100

             Num_diner.text=cash.toString()
         }

         ImageTenCent.setOnClickListener {
             data = data+10

             cash = data/100

             Num_diner.text=cash.toString()
         }
     }

    fun bin(){
        ImageFiveCent=findViewById(R.id.Five_cent_img)
        ImageTenCent=findViewById(R.id.Ten_Cent_img)
        Num_diner=findViewById(R.id.Num_Diner_TextView)
    }
}