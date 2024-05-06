package com.example.mypetpal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var imageViewPet: ImageView
    private lateinit var buttonFeed: Button
    private lateinit var buttonClean: Button
    private lateinit var buttonPlay: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageViewPet = findViewById(R.id.imageViewPet)
        buttonFeed = findViewById(R.id.buttonFeed)
        buttonClean = findViewById(R.id.buttonClean)
        buttonPlay = findViewById(R.id.buttonPlay)

        buttonFeed.setOnClickListener {
            feedPet()
        }

        buttonClean.setOnClickListener {
            cleanPet()
        }

        buttonPlay.setOnClickListener {
            playWithPet()
        }
    }

    private fun feedPet() {
        // Change pet's image to feeding action icon
        imageViewPet.setImageResource(R.drawable.PET3)
        // Update status values accordingly
        // Example: Update health, hunger, cleanliness status
    }

    private fun cleanPet() {
        // Change pet's image to cleaning action icon
        imageViewPet.setImageResource(R.drawable.pet5)
        // Update status values accordingly
        // Example: Update health, hunger, cleanliness status
    }

    private fun playWithPet() {
        // Change pet's image to playing action icon
        imageViewPet.setImageResource(R.drawable.pet6)
        // Update status values accordingly
        // Example: Update health, hunger, cleanliness status
    }
}
