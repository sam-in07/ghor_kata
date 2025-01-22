package com.creativeitinstitute.dicerollapp

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var rollBtn: Button
    private lateinit var diceIv : ImageView
    private lateinit var dice : Dice
    val lucknum = 777
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        dice = Dice()



        rollBtn = findViewById(R.id.rollBtn)
        diceIv = findViewById(R.id.diceIv)

        rollBtn.setOnClickListener {
            rollDice()

        }
    }

    private fun rollDice() {

        val roolnumber = dice.roll(1, 6)
        when(roolnumber) {
            1 -> diceIv.setImageResource(R.drawable.dicee1)
            2 -> diceIv.setImageResource(R.drawable.dicee2)
            3 -> diceIv.setImageResource(R.drawable.dicee3)
            4 -> diceIv.setImageResource(R.drawable.dicee4)
            5 -> diceIv.setImageResource(R.drawable.dicee5)
            6 -> diceIv.setImageResource(R.drawable.dicee6)
        }
    }

}