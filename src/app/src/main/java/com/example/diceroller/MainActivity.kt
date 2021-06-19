package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Dice {

    fun roll(): Int {
        return (1..6).random()
    }
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            val diceVal = Dice().roll()
            val resultTextView: TextView = findViewById(R.id.textView)
            resultTextView.text = diceVal.toString()
        }
    }
}