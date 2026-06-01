package com.example.myrecyclerviewapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myrecyclerview.model.tree

class TreeAdapter(var data: MutableList<tree>) :
    RecyclerView.Adapter<Nature>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Nature {

        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.nature, parent, false)

        return Nature(view)
    }

    override fun onBindViewHolder(holder: Nature, position: Int) {

        holder.name.text = data[position].name
        holder.title.text = data[position].title
        holder.img.setImageResource(data[position].image)
    }

    override fun getItemCount(): Int {

        return data.size
    }
}