package com.example.nlpc.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.nlpc.R
import com.example.nlpc.model.BrowseCategoryModel

class BrowseCategoryAdapter:RecyclerView.Adapter<BrowseCategoryAdapter.BrowseCategoryViewHolder>() {

    private var browseCategoryModel= emptyList<BrowseCategoryModel>()

    inner class BrowseCategoryViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val BrowseCategoryImage: ImageView = view.findViewById(R.id.categoryImage)
        val BrowseCategoryName: TextView = view.findViewById(R.id.categoryName)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BrowseCategoryViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.category_item,parent,false)
        return  BrowseCategoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: BrowseCategoryViewHolder, position: Int) {
       val currentCategory=browseCategoryModel[position]

        holder.BrowseCategoryName.text=currentCategory.name
        holder.BrowseCategoryImage.setImageResource(currentCategory.image)
    }

    override fun getItemCount(): Int {
        return browseCategoryModel.size
    }
    fun setLocationData(newCategoryModel: List<BrowseCategoryModel>){
        browseCategoryModel=newCategoryModel
    }
}