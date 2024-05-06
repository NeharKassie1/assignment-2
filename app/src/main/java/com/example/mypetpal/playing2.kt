package com.example.mypetpal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CleaningActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cleaning)

        val buttonClean = findViewById<Button>(R.id.buttonClean)

        buttonClean.setOnClickListener {
            // Implement cleaning logic here
            // For example, update pet's status values and return to main activity
            // You can use intents to pass data back to the main activity if needed
            finish() // Finish the current activity to return to the main activity
        }
    }
}
