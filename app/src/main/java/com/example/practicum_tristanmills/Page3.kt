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

        GobackButton.setOnClickListener {
            val intent = Intent (this, Page2 ::class.java)
            startActivity(intent)
        }
        val MainMenuButton = findViewById<Button>(R.id.MainMenu2)

        MainMenuButton.setOnClickListener {
            val intent = Intent (this, MainActivity ::class.java)
            startActivity(intent)
        }
    }

}
