package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
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

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            val diceVal = Dice().roll()
            val resultImageView: ImageView = findViewById(R.id.imageView)

            when (diceVal) {
                1 -> {
                    resultImageView.setImageResource(R.drawable.dice_1)
                }
                2 -> {
                    resultImageView.setImageResource(R.drawable.dice_2)
                }
                3 -> {
                    resultImageView.setImageResource(R.drawable.dice_3)
                }
                4 -> {
                    resultImageView.setImageResource(R.drawable.dice_4)
                }
                5 -> {
                    resultImageView.setImageResource(R.drawable.dice_5)
                }
                6 -> {
                    resultImageView.setImageResource(R.drawable.dice_6)
                }
            }

        }
    }
}