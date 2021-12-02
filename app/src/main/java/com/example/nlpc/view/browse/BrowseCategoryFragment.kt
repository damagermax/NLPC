package com.example.nlpc.view.browse

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nlpc.R
import com.example.nlpc.adapter.BrowseCategoryAdapter
import com.example.nlpc.model.BrowseCategoryModel

 const val TAG:String="hi"

class BrowseCategoryFragment : Fragment() {


    private lateinit var browseCategoryRecyclerView:RecyclerView
    private lateinit var addCategory:TextView
    private lateinit var browseCategoryAdapter: BrowseCategoryAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.fragment_browse_category, container, false)

        browseCategoryRecyclerView=view.findViewById(R.id.browseCategoryRecyclerView)
        addCategory=view.findViewById(R.id.addCategoryTv)
        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val items= arrayListOf(
            BrowseCategoryModel("Faith",R.drawable.red,5),
            BrowseCategoryModel("Prayer and Spiritual Warfare",R.drawable.blue,5),BrowseCategoryModel("Faith",R.drawable.red,5),
            BrowseCategoryModel("Prayer and Spiritual Warfare",R.drawable.blue,5),BrowseCategoryModel("Faith",R.drawable.red,5),
            BrowseCategoryModel("Prayer and Spiritual Warfare",R.drawable.blue,5),BrowseCategoryModel("Faith",R.drawable.red,5),
            BrowseCategoryModel("Prayer and Spiritual Warfare",R.drawable.blue,5),BrowseCategoryModel("Faith",R.drawable.red,5),
            BrowseCategoryModel("Prayer and Spiritual Warfare",R.drawable.blue,5),BrowseCategoryModel("Faith",R.drawable.red,5),
            BrowseCategoryModel("Prayer and Spiritual Warfare",R.drawable.blue,5),BrowseCategoryModel("Faith",R.drawable.red,5),
            BrowseCategoryModel("Prayer and Spiritual Warfare",R.drawable.blue,5),BrowseCategoryModel("Faith",R.drawable.red,5),
            BrowseCategoryModel("Prayer and Spiritual Warfare",R.drawable.blue,5),BrowseCategoryModel("Faith",R.drawable.red,5),
            BrowseCategoryModel("Prayer and Spiritual Warfare",R.drawable.blue,5),BrowseCategoryModel("Faith",R.drawable.red,5),
            BrowseCategoryModel("Prayer and Spiritual Warfare",R.drawable.blue,5),BrowseCategoryModel("Faith",R.drawable.red,5),
            BrowseCategoryModel("Prayer and Spiritual Warfare",R.drawable.blue,5),BrowseCategoryModel("Faith",R.drawable.red,5),
            BrowseCategoryModel("Prayer and Spiritual Warfare",R.drawable.blue,5),
        )

        browseCategoryAdapter= BrowseCategoryAdapter()
        browseCategoryAdapter.setLocationData(items)
        browseCategoryRecyclerView.setHasFixedSize(true)
        browseCategoryRecyclerView.layoutManager=GridLayoutManager(requireActivity(),2)
        browseCategoryRecyclerView.adapter=browseCategoryAdapter



        addCategory.setOnClickListener {
           val addCategoryBottomSheet=AddCategoryBottomSheet()
            val manager: FragmentManager =
                (this.context as AppCompatActivity).supportFragmentManager
            addCategoryBottomSheet.show(manager, TAG)

        }
    }
}