package com.example.practicum_tristanmills

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Page3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)
        val GobackButton = findViewById<Button>(R.id.Back2)
        // this button is used to go back to the previous page
        GobackButton.setOnClickListener {
            val intent = Intent (this, Page2 ::class.java)
            startActivity(intent)
        }
        // this button is used to go back to the main menu
        val MainMenuButton = findViewById<Button>(R.id.MainMenu2)

        MainMenuButton.setOnClickListener {
            val intent = Intent (this, MainActivity ::class.java)
            startActivity(intent)
        }
        // this is athe Arrays
        val weather = arrayOf<String>(
            "Monday: 5° and 14°, Rainy.",
            "Tuesday: 15° and 29°, Sunny.",
            "Wednesday: 5° and 14°, Raining.",
            "Thursday: 2° and 9°, Storm.",
            "Friday: 20° and 32°, Sunny.",
            "Saturday: 4° and 14°, raining.",
            "Sunday: 5° and 15°, Cloudy.")
    }
}
