package com.example.mypetpal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FeedingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feeding)

        val buttonFeed = findViewById<Button>(R.id.buttonFeed)

        buttonFeed.setOnClickListener {
            // Implement feeding logic here
            // For example, update pet's status values and return to main activity
            // You can use intents to pass data back to the main activity if needed
            finish() // Finish the current activity to return to the main activity
        }
    }
}
