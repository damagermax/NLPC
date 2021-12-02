package com.example.nlpc.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.nlpc.R
import com.example.nlpc.model.EpisodeModel


class EpisodeAdapter:RecyclerView.Adapter<EpisodeAdapter.EpisodeViewHolder>() {

    private var episodeModel= emptyList<EpisodeModel>()

    inner class EpisodeViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val episodeImage: ImageView = view.findViewById(R.id.episode_image)
        val episodeName: TextView = view.findViewById(R.id.episode_name)
        val episodeDate: TextView = view.findViewById(R.id.episode_date)
        val episodeDuration: TextView = view.findViewById(R.id.episode_duration)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EpisodeViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.episode_item,parent,false)
        return  EpisodeViewHolder(view)
    }

    override fun onBindViewHolder(holder: EpisodeViewHolder, position: Int) {
        val currentEpisode=episodeModel[position]

        holder.episodeName.text=currentEpisode.name
        holder.episodeImage.setImageResource(currentEpisode.image)
        holder.episodeDate.text=currentEpisode.date
        holder.episodeDuration.text=currentEpisode.duration
    }

    override fun getItemCount(): Int {
        return episodeModel.size
    }

    fun setEpisodeData(newEpisodeModel: List<EpisodeModel>){
        episodeModel=newEpisodeModel
    }
}