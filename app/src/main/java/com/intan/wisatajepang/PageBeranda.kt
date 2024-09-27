package com.intan.wisatajepang

import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity
import com.intan.wisatajepang.adapter.LocationAdapter
import com.intan.wisatajepang.model.LocationModel

class PageBeranda : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_beranda)

        val gridView: GridView = findViewById(R.id.locations_grid)


        val locations = listOf(
            LocationModel("Sensoji Temple", R.drawable.img2),
            LocationModel("Temple", R.drawable.img3),
            LocationModel("Sensoji Temple", R.drawable.img2),
            LocationModel("Temple", R.drawable.img3)
        )


        val adapter = LocationAdapter(this, locations)
        gridView.adapter = adapter


        gridView.setOnItemClickListener { _, _, position, _ ->
            val selectedLocation = locations[position]
            val intent = Intent(this, DetailPage::class.java).apply {
                putExtra("destinationName", selectedLocation.name)
                putExtra("destinationImage", selectedLocation.imageResId)
            }
            startActivity(intent)
        }
    }
}