package com.example.interactiveapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonDark=findViewById<Button>(R.id.buttonDark)
        val buttonRead=findViewById<Button>(R.id.buttonRead)
        val layout=findViewById<LinearLayout>(R.id.LinearLayout)

        buttonRead.setOnClickListener{
            //change the the theme to light mode
            layout.setBackgroundResource(R.color.yellow)
        }

        buttonDark.setOnClickListener{
            layout.setBackgroundResource(R.color.black)
        }
    }
}