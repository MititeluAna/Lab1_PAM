package com.example.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inalt = findViewById<TextView>(R.id.inalt);
        val masa = findViewById<TextView>(R.id.masa);
        val indice = findViewById<TextView>(R.id.indice);
        val buton = findViewById<Button>(R.id.but);

        buton.setOnClickListener {
            val masa = masa.text.toString().toDouble();
            val inalt = inalt.text.toString().toDouble();

            val calcul = (masa / (inalt * inalt));

            indice.text = calcul.toString();
        }
    }
}