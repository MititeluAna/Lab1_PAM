package com.example.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        b_calculer.setOnClickListener{
            val masa = et_masa.text.toString().toDouble()
        val inalt = et_inalt.text.toString().toDouble()

        indice = (masa / (inalt * inalt)).toSting()
            //vineive
        }
    }
}