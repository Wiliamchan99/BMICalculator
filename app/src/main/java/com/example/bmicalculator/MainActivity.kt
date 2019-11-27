package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(){

            val input1:String = editText.text.toString()
            val weight:Double = input1.toDouble()

            val input2:String = editText2.text.toString()
            val height:Double = input2.toDouble()

            //calculate
            val result:Double = weight / (height * height)

            //display
            if (result < 18.5)
            {
                imageView.setImageResource(R.drawable.under)
                textView.text = "BMI : %.2f   \nYou are Under weight! ".format(result)
            }
            else if (result >= 18.5 && result <= 24.9)
            {
                imageView.setImageResource(R.drawable.normal)
                textView.text = "BMI : %.2f   \nYou are Normal! ".format(result)
            }
            else if (result > 25)
            {
                imageView.setImageResource(R.drawable.over)
                textView.text = "BMI : %.2f   \nYou are Over weight! ".format(result)
            }

        }

        button2.setOnClickListener(){
            editText.text.clear()
            editText2.text.clear()
            imageView.setImageResource(R.drawable.empty)
            textView.text = ""
        }

    }
}
