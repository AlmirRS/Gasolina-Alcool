package com.tech.ng.alcoolgasolina

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

 lateinit var btnCalcular: Button
 lateinit var editGasolina: EditText
 lateinit var editAlcool: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalcular = findViewById(R.id.btnCalcular)
        editGasolina = findViewById(R.id.editGasolina)
        editAlcool = findViewById(R.id.editAlcool)

        btnCalcular.setOnClickListener {
            val digiteGasolina = editGasolina.text.toString()
            val digiteAlcool = editAlcool.text.toString()

            if (digiteGasolina.isNotEmpty() && digiteAlcool.isNotEmpty()){

                val intent = Intent(this, DetalhesActivity::class.java)
                intent.putExtra("valorGasolina", digiteGasolina.toDouble())
                intent.putExtra("valorAlcool", digiteAlcool.toDouble())
                startActivity(intent)

                Toast.makeText(this,"Bom abastecimento :-)", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this,"Digite o valor da Gasolina e do alcool ultilizando o ponto '.' ", Toast.LENGTH_LONG).show()
            }
        }
    }
}