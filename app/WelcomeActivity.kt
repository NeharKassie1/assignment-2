package com.example.mypetpal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val buttonStart = findViewById<Button>(R.id.buttonStart)

        buttonStart.setOnClickListener {
            // Start MainActivity when the Start button is clicked
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            // Finish the current activity to prevent going back to the welcome screen
            finish()
        }
    }
}
