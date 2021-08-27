package com.example.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.rollBtn)
        rollButton.setOnClickListener {
            rollDiceOne()
            rollDiceTwo()
        }
    }

    private fun rollDiceOne() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val image: ImageView = findViewById(R.id.diceOne)


        val diceImages = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        image.setImageResource(diceImages)
    }

    private fun rollDiceTwo() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val image: ImageView = findViewById(R.id.diceTwo)


        val diceImages = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        image.setImageResource(diceImages)
    }

    class Dice(private val sides: Int) {
        fun roll(): Int {
            return (1..sides).random()
        }
    }
}