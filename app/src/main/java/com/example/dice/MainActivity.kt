package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //brings the layout from activity_main.xml

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener { drawNumber() }
    }
    fun drawNumber(){
        val imageView: ImageView = findViewById(R.id.imageView)
        val dice = Dice()
        val number = dice.roll()

        when(number){
            1 -> imageView.setImageResource(R.drawable.dice_1)
            2 -> imageView.setImageResource(R.drawable.dice_2)
            3 -> imageView.setImageResource(R.drawable.dice_3)
            4 -> imageView.setImageResource(R.drawable.dice_4)
            5 -> imageView.setImageResource(R.drawable.dice_5)
            6 -> imageView.setImageResource(R.drawable.dice_6)
        }
    }
}