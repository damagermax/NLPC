package com.example.nlpc.view.subcategory

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.nlpc.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class AddSubCategoryBottomSheet:BottomSheetDialogFragment() {

    private lateinit var cancel: Button
    private lateinit var upload: Button
    private lateinit var subCategoryName: TextView
    private lateinit var subCategoryImage: ImageView


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view=inflater.inflate(R.layout.add_sub_category_bottom_sheet, container, false)
        cancel = view.findViewById(R.id.subCategoryCancelBtn)
        upload = view.findViewById(R.id.subCategoryUploadBtn)
        subCategoryName= view.findViewById(R.id.subCategoryNameEt)
        subCategoryImage= view.findViewById(R.id.subCategoryImageIv)
        return view
    }
}