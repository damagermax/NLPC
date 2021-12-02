package com.example.nlpc.view.browse

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.nlpc.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class AddCategoryBottomSheet:BottomSheetDialogFragment() {

    private lateinit var cancel: Button
    private lateinit var upload: Button
    private lateinit var categoryNamne: TextView
    private lateinit var categoryImage: ImageView


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view=inflater.inflate(R.layout.add_category, container, false)
       // cancel = view.findViewById(R.id.categoryCancelBtn)
        upload = view.findViewById(R.id.categoryUploadBtn)
        categoryNamne= view.findViewById(R.id.categoryNameEt)
        categoryImage= view.findViewById(R.id.categoryImageIv)
        return view
    }
}