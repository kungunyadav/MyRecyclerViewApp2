package com.example.myrecyclerviewapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myrecyclerview.model.tree

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: TreeAdapter

    var data = mutableListOf<tree>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.rec)

        recyclerView.layoutManager = LinearLayoutManager(this)

        data.add(tree("First", "Tree1", R.drawable.a1))
        data.add(tree("Second", "Tree2", R.drawable.a2))
        data.add(tree("Third", "Tree3", R.drawable.a3))
        data.add(tree("Fourth", "Tree4", R.drawable.a4))
        data.add(tree("Fifth", "Tree5", R.drawable.a5))
        data.add(tree("Sixth", "Tree6", R.drawable.a6))

        adapter = TreeAdapter(data)

        recyclerView.adapter = adapter
    }
}