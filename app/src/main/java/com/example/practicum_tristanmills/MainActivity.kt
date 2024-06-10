package com.example.practicum_tristanmills

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Button to get to the next page
        val getStartedButton = findViewById<Button>(R.id.MainMenu)

        getStartedButton.setOnClickListener {
            val intent = Intent (this, Page2::class.java)

            startActivity(intent)
        }
        // Exit button to stop the app
        val exitButton = findViewById<Button>(R.id.Exit)
        exitButton.setOnClickListener {
            finishAffinity()
        }
    }
}

