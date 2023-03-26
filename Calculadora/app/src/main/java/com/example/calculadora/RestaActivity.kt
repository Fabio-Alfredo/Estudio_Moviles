package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class RestaActivity : AppCompatActivity() {

    private lateinit var EditText_Num_One_Rest:EditText
    private lateinit var EditText_Num_Two_Rest:EditText
    private lateinit var Button_Result_Rest:Button
    private lateinit var TextView_Result_Rest:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resta)

        if(intent!=null){
            intent.extras?.apply {  }
            bind()
            AddListener()
        }
    }

    fun Resta(){
        if(EditText_Num_One_Rest.text.toString().isEmpty() && EditText_Num_Two_Rest.text.toString().isEmpty()){
            Toast.makeText(this, "Ingrese los datos solicitados", Toast.LENGTH_SHORT).show()
        }
        else if(EditText_Num_One_Rest.text.toString().isEmpty()){
            Toast.makeText(this, "El primer campo esta vacio", Toast.LENGTH_SHORT).show()
        }
        else if(EditText_Num_Two_Rest.text.toString().isEmpty()){
            Toast.makeText(this, "El segundo campo esta vacio", Toast.LENGTH_SHORT).show()
        }
        else{
            var NumR1 = EditText_Num_One_Rest.text.toString().toFloat()
            var NumR2 = EditText_Num_Two_Rest.text.toString().toFloat()
            val resta = NumR1 - NumR2

            TextView_Result_Rest.text = "El resultado es: $resta"
        }
    }

    fun AddListener(){
        Button_Result_Rest.setOnClickListener { Resta() }
    }

    fun bind(){
        EditText_Num_One_Rest = findViewById(R.id.EditText_Num_One_rest)
        EditText_Num_Two_Rest = findViewById(R.id.EditText_Num_two_rest)
        Button_Result_Rest = findViewById(R.id.Button_Calcular_rest)
        TextView_Result_Rest = findViewById(R.id.TextView_Result_rest)
    }
}