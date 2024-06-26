package com.example.practicum_tristanmills

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Page2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)
        //Button to get to the next page
        val page3Button = findViewById<Button>(R.id.weeklyWeather)
        //this button is used to go to the next page
        page3Button.setOnClickListener {
            val intent = Intent (this, Page3::class.java)

            startActivity(intent)
        }
        // this button is used to go back to the main menu
        val GobackButton = findViewById<Button>(R.id.Back)

        GobackButton.setOnClickListener {
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}