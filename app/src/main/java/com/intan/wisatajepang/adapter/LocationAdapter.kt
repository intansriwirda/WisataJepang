package com.intan.wisatajepang.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.intan.wisatajepang.R
import com.intan.wisatajepang.model.LocationModel

class LocationAdapter(private val context: Context, private val data: List<LocationModel>) : BaseAdapter() {

    override fun getCount(): Int = data.size

    override fun getItem(position: Int): Any = data[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val inflater = LayoutInflater.from(context)
        val view = convertView ?: inflater.inflate(R.layout.grid_item, parent, false)

        val locationName = view.findViewById<TextView>(R.id.location_name)
        val locationImage = view.findViewById<ImageView>(R.id.imageView) // Pastikan kamu punya ImageView dengan ID ini

        // Set data
        locationName.text = data[position].name
        locationImage.setImageResource(data[position].imageResId)

        return view
    }
}