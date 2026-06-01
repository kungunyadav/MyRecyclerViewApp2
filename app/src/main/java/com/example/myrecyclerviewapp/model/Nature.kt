package com.example.myrecyclerviewapp

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Nature(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var img: ImageView
    var name: TextView
    var title: TextView

    init {

        img = itemView.findViewById(R.id.img)
        name = itemView.findViewById(R.id.name)
        title = itemView.findViewById(R.id.title)
    }
}