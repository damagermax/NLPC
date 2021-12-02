package com.example.nlpc.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.nlpc.R

import com.example.nlpc.model.SubCategoryModel

class SubCategoryAdapter:RecyclerView.Adapter<SubCategoryAdapter.SubCategoryViewHolder>() {

    private var subCategoryModel= emptyList<SubCategoryModel>()

    inner class SubCategoryViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val subCategoryImage: ImageView = view.findViewById(R.id.subCategoryImage)
        val subCategoryName: TextView = view.findViewById(R.id.subCategoryName)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SubCategoryViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.sub_category_item,parent,false)
        return  SubCategoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: SubCategoryViewHolder, position: Int) {
        val currentCategory=subCategoryModel[position]

        holder.subCategoryName.text=currentCategory.name
        holder.subCategoryImage.setImageResource(currentCategory.image)
    }

    override fun getItemCount(): Int {
        return subCategoryModel.size
    }
    fun setSubCategoryData(newSubCategoryModel: List<SubCategoryModel>){
        subCategoryModel=newSubCategoryModel
    }
}