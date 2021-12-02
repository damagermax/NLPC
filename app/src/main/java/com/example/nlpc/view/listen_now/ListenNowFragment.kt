package com.example.nlpc.view.listen_now

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nlpc.R
import com.example.nlpc.adapter.SubCategoryAdapter
import com.example.nlpc.adapter.TopPickAdapter
import com.example.nlpc.model.SubCategoryModel
import com.example.nlpc.model.TopPickModel


class ListenNowFragment : Fragment() {

    private lateinit var topPickRecyclerView: RecyclerView
    private lateinit var addCategory: TextView
    private lateinit var topPickAdapter: TopPickAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_listen_now, container, false)
        topPickRecyclerView = view.findViewById(R.id.topPickRecyclerView)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val items = arrayListOf(
            TopPickModel("Faith", R.drawable.red, 5),
            TopPickModel("Prayer and Spiritual Warfare", R.drawable.blue, 5),
            TopPickModel("Faith", R.drawable.red, 5),
            TopPickModel("Prayer and Spiritual Warfare", R.drawable.blue, 5),
            TopPickModel("Faith", R.drawable.red, 5),
            TopPickModel("Prayer and Spiritual Warfare", R.drawable.blue, 5),
            TopPickModel("Faith", R.drawable.red, 5),
            TopPickModel("Prayer and Spiritual Warfare", R.drawable.blue, 5),
            TopPickModel("Faith", R.drawable.red, 5),
            TopPickModel("Prayer and Spiritual Warfare", R.drawable.blue, 5),
            TopPickModel("Faith", R.drawable.red, 5),
            TopPickModel("Prayer and Spiritual Warfare", R.drawable.blue, 5),
            TopPickModel("Faith", R.drawable.red, 5),
            TopPickModel("Prayer and Spiritual Warfare", R.drawable.blue, 5),
        )


        topPickAdapter = TopPickAdapter()
        topPickAdapter.setTopPickData(items)
        topPickRecyclerView.setHasFixedSize(true)
        topPickRecyclerView.adapter = topPickAdapter
    }


}