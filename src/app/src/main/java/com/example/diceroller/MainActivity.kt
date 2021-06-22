package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get button object.
        val rollButton: Button = findViewById(R.id.button)
        // Set onclick for the button above.
        rollButton.setOnClickListener {
            rollDice()
        }
        rollDice()
    }

    private fun rollDice() {
        // Create dice object.
        val diceVal = Dice().roll()

        // Get image view.
        val resultImageView: ImageView = findViewById(R.id.imageView)

        // Check which image to set based on diceVal.
        val drawableResource = when (diceVal) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        // Set the image view with the correct drawable.
        resultImageView.setImageResource(drawableResource)

        // Set content description for screen readers.
        resultImageView.contentDescription = diceVal.toString()
    }
}

class Dice {
    fun roll(): Int {
        return (1..6).random()
    }
}


