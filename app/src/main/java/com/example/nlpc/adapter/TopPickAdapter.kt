package com.example.nlpc.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.nlpc.R
import com.example.nlpc.model.TopPickModel

class TopPickAdapter:RecyclerView.Adapter<TopPickAdapter.TopPickViewHolder>() {

    private var topPickModel= emptyList<TopPickModel>()

    inner class TopPickViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val topPickImage: ImageView = view.findViewById(R.id.topPickImage)
        val topPickName: TextView = view.findViewById(R.id.topPickName)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopPickViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.top_picks_item,parent,false)
        return  TopPickViewHolder(view)
    }

    override fun onBindViewHolder(holder: TopPickViewHolder, position: Int) {
        val currentCategory=topPickModel[position]

        holder.topPickName.text=currentCategory.name
        holder.topPickImage.setImageResource(currentCategory.image)
    }

    override fun getItemCount(): Int {
        return topPickModel.size
    }
    fun setTopPickData(newTopPickModel: List<TopPickModel>){
        topPickModel=newTopPickModel
    }
}