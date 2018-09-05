package com.raulpineres.recyclerviewproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var items : ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        items = fillItems()

        recycler_view.layoutManager = LinearLayoutManager(this)

        recycler_view.adapter = RecyclerAdapter(items, this)
    }

    private fun fillItems() : ArrayList<String>{
        val itemsArrayList = arrayListOf<String>(
                "Hola",
                "Raúl",
                "Cosqui",
                "Perez",
                "Sebastian",
                "Victor",
                "Kotlin",
                "Willy",
                "Wonka",
                "Chikenazo",
                "Subway",
                "Ionic",
                "Angular"
        )

        return itemsArrayList
    }
}
