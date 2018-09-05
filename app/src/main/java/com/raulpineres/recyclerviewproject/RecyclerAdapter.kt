package com.raulpineres.recyclerviewproject

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_recycler_view.view.*

class RecyclerAdapter (val items : ArrayList<String>, val context: Context) : RecyclerView.Adapter<MyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder =
            MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_recycler_view, parent, false))

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textView?.text = items.get(position)
    }
}

class MyViewHolder (view : View) : RecyclerView.ViewHolder(view){
    val textView = view.text_view
}