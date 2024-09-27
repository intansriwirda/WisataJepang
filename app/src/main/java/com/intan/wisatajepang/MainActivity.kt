package com.intan.wisatajepang

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Tombol untuk berpindah ke halaman detail
        val buttonDetail: Button = findViewById(R.id.btnSplash)
        buttonDetail.setOnClickListener {
            // Intent untuk pindah ke PageBeranda
            val intent = Intent(this@MainActivity, PageBeranda::class.java)
            intent.putExtra("PLACE_NAME", "Sensoji Temple")
            intent.putExtra("PLACE_DESC", "It is Tokyo's oldest temple, and one of the most significant. Formerly associated with the Tendai sect of Buddhism.")
            startActivity(intent)
        }
    }
}