package com.example.practicum_tristanmills

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Page3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)
        val backButton = findViewById<Button>(R.id.Back)

        backButton.setOnClickListener {
            finish() // This will close the current activity and return to the previous one
        }
    }

}
