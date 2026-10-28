package com.example.pirmas_boguzas

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var isTextChanged = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val buttonPaspausk = findViewById<Button>(R.id.buttonPaspausk)
        val buttonSpalva = findViewById<Button>(R.id.buttonSpalva)
        val buttonAtstatyk = findViewById<Button>(R.id.buttonAtstatyk)

        // 1. Mygtukas "Paspausk"
        buttonPaspausk.setOnClickListener {
            if (isTextChanged) {
                textView.text = "Labas"
                isTextChanged = false
            } else {
                textView.text = "Sveiki atvykę į MarTech!"
                isTextChanged = true
            }
        }

        // 2. Mygtukas "Pakeisk teksto spalvą"
        buttonSpalva.setOnClickListener {
            textView.setTextColor(Color.RED)
        }

        // 3. Mygtukas "Atstatyk"
        buttonAtstatyk.setOnClickListener {
            textView.text = "Labas"
            textView.setTextColor(Color.BLACK)
            isTextChanged = false
        }
    }
}