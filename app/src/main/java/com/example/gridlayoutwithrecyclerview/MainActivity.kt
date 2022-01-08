package com.example.gridlayoutwithrecyclerview

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gridlayoutwithrecyclerview.adapter.Adapter

class MainActivity : AppCompatActivity() {
    private lateinit var context: Context
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: Adapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()

    }

    private fun initView() {
        context = this
        adapter = Adapter(context, addItems())
        recyclerView = findViewById(R.id.recyclerview)
        recyclerView.layoutManager = GridLayoutManager(context, 3)
        recyclerView.adapter = adapter

    }

    private fun addItems(): ArrayList<String> {
        val items = ArrayList<String>()
        for (i in 0..200) {
            items.add("Item $i")
        }
        return items
    }
}