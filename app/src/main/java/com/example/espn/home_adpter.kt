package com.example.espn

import android.content.ClipData
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class home_adpter (private val itemList: List<data>) : RecyclerView.Adapter<home_adpter.ViewHolder>(){


        class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val textView = itemView.findViewById<TextView>(R.id.textView)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.home_adapter, parent, false)
            return ViewHolder(view)
        }

        override fun getItemCount(): Int = itemList.size

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.textView.text = itemList[position].name
        }


}