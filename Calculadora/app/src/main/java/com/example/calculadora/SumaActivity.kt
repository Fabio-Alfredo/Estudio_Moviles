package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class SumaActivity : AppCompatActivity() {

    private lateinit var EditText_NumOne:EditText
    private lateinit var EditText_NumTwo:EditText
    private lateinit var Button_Suma:Button
    private lateinit var TextView_Result:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_suma)


        if(intent!=null){
            intent.extras?.apply {
            }
            bind()
            AddListener()
        }

    }

    fun suma(){
        if(EditText_NumOne.text.toString().isEmpty() && EditText_NumTwo.text.toString().isEmpty()){
            Toast.makeText(this, "Ingrese los datos solicitados", Toast.LENGTH_SHORT).show()
        }
        else if(EditText_NumOne.text.toString().isEmpty()){
            Toast.makeText(this, "El primer campo esta vacio", Toast.LENGTH_SHORT).show()
        }
        else if(EditText_NumTwo.text.toString().isEmpty()){
            Toast.makeText(this, "El segundo campo esta vacio", Toast.LENGTH_SHORT).show()
        }
        else{
            var Num1 = EditText_NumOne.text.toString().toFloat()
            var Num2 = EditText_NumTwo.text.toString().toFloat()
            val sum =Num1 + Num2

            TextView_Result.text = "El resultado es: $sum"
        }
    }

    fun AddListener(){
        Button_Suma.setOnClickListener {
            suma()
        }
    }

    fun bind(){
        EditText_NumOne = findViewById(R.id.EditText_Num_One)
        EditText_NumTwo = findViewById(R.id.EditText_Num_two)
        Button_Suma = findViewById(R.id.Button_Calcular)
        TextView_Result = findViewById(R.id.TextView_Result)
    }
}