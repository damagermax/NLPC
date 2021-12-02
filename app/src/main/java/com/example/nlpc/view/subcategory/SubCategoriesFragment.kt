package com.example.nlpc.view.subcategory

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nlpc.R
import com.example.nlpc.adapter.BrowseCategoryAdapter
import com.example.nlpc.adapter.SubCategoryAdapter
import com.example.nlpc.model.BrowseCategoryModel
import com.example.nlpc.model.SubCategoryModel
import com.example.nlpc.view.browse.AddCategoryBottomSheet
import com.example.nlpc.view.browse.TAG

class SubCategoriesFragment : Fragment() {

    private lateinit var subCategoryRecyclerView: RecyclerView
    private lateinit var addSubCategory: TextView
    private lateinit var subCategoryAdapter: SubCategoryAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view=inflater.inflate(R.layout.fragment_sub_categories, container, false)
        subCategoryRecyclerView=view.findViewById(R.id.subCategoryRecyclerView)
        addSubCategory=view.findViewById(R.id.addSubCategoryTv)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)




        val items= arrayListOf(
            SubCategoryModel("Faith",R.drawable.red,5),
            SubCategoryModel("Prayer and Spiritual Warfare",R.drawable.blue,5),
            SubCategoryModel("Faith",R.drawable.red,5),
            SubCategoryModel("Prayer and Spiritual Warfare",R.drawable.blue,5), SubCategoryModel("Faith",R.drawable.red,5),
            SubCategoryModel("Prayer and Spiritual Warfare",R.drawable.blue,5), SubCategoryModel("Faith",R.drawable.red,5),
            SubCategoryModel("Prayer and Spiritual Warfare",R.drawable.blue,5), SubCategoryModel("Faith",R.drawable.red,5),
            SubCategoryModel("Prayer and Spiritual Warfare",R.drawable.blue,5), SubCategoryModel("Faith",R.drawable.red,5),
            SubCategoryModel("Prayer and Spiritual Warfare",R.drawable.blue,5), SubCategoryModel("Faith",R.drawable.red,5),
            SubCategoryModel("Prayer and Spiritual Warfare",R.drawable.blue,5), SubCategoryModel("Faith",R.drawable.red,5),
            SubCategoryModel("Prayer and Spiritual Warfare",R.drawable.blue,5), SubCategoryModel("Faith",R.drawable.red,5),
            SubCategoryModel("Prayer and Spiritual Warfare",R.drawable.blue,5), SubCategoryModel("Faith",R.drawable.red,5),
            SubCategoryModel("Prayer and Spiritual Warfare",R.drawable.blue,5), SubCategoryModel("Faith",R.drawable.red,5),
            SubCategoryModel("Prayer and Spiritual Warfare",R.drawable.blue,5),

        )

        subCategoryAdapter= SubCategoryAdapter()
        subCategoryAdapter.setSubCategoryData(items)
        subCategoryRecyclerView.setHasFixedSize(true)
        subCategoryRecyclerView.layoutManager= GridLayoutManager(requireActivity(),2)
        subCategoryRecyclerView.adapter=subCategoryAdapter


        // show add sub category bottom sheet
        addSubCategory.setOnClickListener {
            val addCategoryBottomSheet= AddSubCategoryBottomSheet()
            val manager: FragmentManager =
                (this.context as AppCompatActivity).supportFragmentManager
            addCategoryBottomSheet.show(manager, TAG)

        }

    }


}