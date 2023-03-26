package com.example.emails

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var SendButtom:Button
    private lateinit var EmailEditText:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bin()

        SendButtom.setOnClickListener { _->
            if(EmailEditText.text.isNotEmpty()){
            val intent=Intent(this, MainActivity2::class.java)
            startActivity(intent)
            }else{
                ErrorDeEmail()
            }
        }
    }

    fun ErrorDeEmail(){
        Toast.makeText(this,"aun no ingresa el email", Toast.LENGTH_SHORT).show()
    }

    fun bin(){
        SendButtom=findViewById(R.id.Contact_Send)
        EmailEditText=findViewById(R.id.Email_Edit_Text)
    }
}