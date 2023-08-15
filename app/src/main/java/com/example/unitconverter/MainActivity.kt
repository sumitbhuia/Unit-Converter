package com.example.unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btn)
        val input= findViewById<EditText>(R.id.kilo_edt)
        val result = findViewById<TextView>(R.id.result_txt)

        button.setOnClickListener(){
            val kilos:Double = input.text.toString().toDouble()
            result.setText("The Value in Pounds is "+ convertKiloToPounds(kilos)+" lbs")
        }


    }
}

fun convertKiloToPounds(kilos: Double): Double {
    return kilos * 2.2046

}