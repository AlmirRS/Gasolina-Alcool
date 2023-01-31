package com.tech.ng.alcoolgasolina

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class DetalhesActivity : AppCompatActivity() {

    lateinit var textPrecoGasolina: TextView
    lateinit var textPrecoAlcool: TextView
    lateinit var textResultado: TextView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes)

        textPrecoGasolina = findViewById(R.id.textPrecoGasolina)
        textPrecoAlcool = findViewById(R.id.textPrecoAlcool)
        textResultado = findViewById(R.id.textResultado)

        val bundle = intent.extras

        if (bundle != null){
            val gasolina = bundle.getDouble("valorGasolina")
            val alcool = bundle.getDouble("valorAlcool")

            textPrecoGasolina.text = "Valor Gasolina: R$ $gasolina"
            textPrecoAlcool.text = "Valor Álcool: R$ $alcool"

            val resultado = alcool / gasolina

            if (resultado > 0.7) {
                textResultado.setText("Gasolina")
            }else{
                textResultado.setText("Álcool")
            }
        }



    }
}