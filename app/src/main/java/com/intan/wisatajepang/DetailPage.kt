package com.intan.wisatajepang

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailPage : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_page)

        // Get the image resource ID from the Intent
        val imageResId = intent.getIntExtra("imageResId", -1)

        // Find the ImageView and set the image resource
        val imageView = findViewById<ImageView>(R.id.imageView)
        if (imageResId != -1) {
            imageView.setImageResource(imageResId)
        }
    }
}