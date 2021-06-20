package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Dice {

    fun roll(): Int {
        return (1..6).random()
    }
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get button object.
        val rollButton: Button = findViewById(R.id.button)
        // Set onClick for out button.
        rollButton.setOnClickListener {
            // Generate random number between 1 & 6.
            val diceVal = Dice().roll()
            // Get textview object.
            val resultTextView: TextView = findViewById(R.id.textView)
            // Set the random number as textview value.
            resultTextView.text = diceVal.toString()
        }
    }
}