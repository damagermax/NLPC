package com.example.nlpc.view.episode

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.nlpc.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class AddEpisodeBottomSheet : BottomSheetDialogFragment() {

    private lateinit var cancel: Button
    private lateinit var upload: Button
    private lateinit var episodeName: TextView
    private lateinit var episodeDate: TextView
    private lateinit var episodeDuration: TextView
    private lateinit var episodeImage: ImageView


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.add_episode_bottom_sheet, container, false)
        cancel = view.findViewById(R.id.episodeCancelBtn)
        upload = view.findViewById(R.id.episodeUploadBtn)
        episodeName = view.findViewById(R.id.episodeNameEt)
        episodeDuration = view.findViewById(R.id.episode_duration)
        episodeDate= view.findViewById(R.id.episode_date)
        episodeImage = view.findViewById(R.id.episodeImageIv)
        return view
    }
}