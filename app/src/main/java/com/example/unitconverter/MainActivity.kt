package com.example.unitconverter

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edt :EditText =findViewById(R.id.kilo_edit)
        val btn: Button =findViewById(R.id.btn)
        val resultText :TextView=findViewById(R.id.result_text)

        btn.setOnClickListener {
        val kilos :Double =edt.text.toString().toDouble()

            resultText.text = ""+ convertToPounds(kilos)
        }
    }
    fun convertToPounds(kilos :Double):Double{
        var pounds =kilos*2.20462
        return pounds

    }

}