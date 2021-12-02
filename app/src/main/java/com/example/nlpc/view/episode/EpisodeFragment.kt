package com.example.nlpc.view.episode

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nlpc.R
import com.example.nlpc.adapter.EpisodeAdapter

import com.example.nlpc.model.EpisodeModel
import com.example.nlpc.view.browse.TAG


const val TAG2:String="Episode Bottom sheet"

class EpisodeFragment : Fragment() {


    private lateinit var episodeRecyclerView: RecyclerView
    private lateinit var addEpisode: TextView
    private lateinit var episodeAdapter: EpisodeAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_episode, container, false)
        episodeRecyclerView = view.findViewById(R.id.episodeRecyclerView)
        addEpisode=view.findViewById(R.id.addEpisodeTv)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val item = arrayListOf(
            EpisodeModel(
                "The Covenant Of Tithing",
                R.drawable.red,
                54,
                "5hr 30mins",
                "30 November 2017"
            ),
            EpisodeModel("The Art of Worship", R.drawable.blue, 54, "1hr", "24 june 2017"),
            EpisodeModel(
                "The Covenant Of Tithing",
                R.drawable.red,
                54,
                "5hr 30mins",
                "30 November 2017"
            ),
            EpisodeModel("The Art of Worship", R.drawable.blue, 54, "1hr", "24 june 2017"),
            EpisodeModel(
                "The Covenant Of Tithing",
                R.drawable.red,
                54,
                "5hr 30mins",
                "30 November 2017"
            ),
            EpisodeModel("The Art of Worship", R.drawable.blue, 54, "1hr", "24 june 2017"),
            EpisodeModel(
                "The Covenant Of Tithing",
                R.drawable.red,
                54,
                "5hr 30mins",
                "30 November 2017"
            ),
            EpisodeModel("The Art of Worship", R.drawable.blue, 54, "1hr", "24 june 2017"),
            EpisodeModel(
                "The Covenant Of Tithing",
                R.drawable.red,
                54,
                "5hr 30mins",
                "30 November 2017"
            ),
            EpisodeModel("The Art of Worship", R.drawable.blue, 54, "1hr", "24 june 2017"),
            EpisodeModel(
                "The Covenant Of Tithing",
                R.drawable.red,
                54,
                "5hr 30mins",
                "30 November 2017"
            ),
            EpisodeModel("The Art of Worship", R.drawable.blue, 54, "1hr", "24 june 2017"),
            EpisodeModel(
                "The Covenant Of Tithing",
                R.drawable.red,
                54,
                "5hr 30mins",
                "30 November 2017"
            ),
            EpisodeModel("The Art of Worship", R.drawable.blue, 54, "1hr", "24 june 2017"),
            EpisodeModel(
                "The Covenant Of Tithing",
                R.drawable.red,
                54,
                "5hr 30mins",
                "30 November 2017"
            ),
            EpisodeModel("The Art of Worship", R.drawable.blue, 54, "1hr", "24 june 2017"),
            EpisodeModel(
                "The Covenant Of Tithing",
                R.drawable.red,
                54,
                "5hr 30mins",
                "30 November 2017"
            ),
            EpisodeModel("The Art of Worship", R.drawable.blue, 54, "1hr", "24 june 2017"),
            EpisodeModel(
                "The Covenant Of Tithing",
                R.drawable.red,
                54,
                "5hr 30mins",
                "30 November 2017"
            ),
            EpisodeModel("The Art of Worship", R.drawable.blue, 54, "1hr", "24 june 2017"),
            EpisodeModel(
                "The Covenant Of Tithing",
                R.drawable.red,
                54,
                "5hr 30mins",
                "30 November 2017"
            ),
            EpisodeModel("The Art of Worship", R.drawable.blue, 54, "1hr", "24 june 2017"),
            EpisodeModel(
                "The Covenant Of Tithing",
                R.drawable.red,
                54,
                "5hr 30mins",
                "30 November 2017"
            ),
            EpisodeModel("The Art of Worship", R.drawable.blue, 54, "1hr", "24 june 2017"),
            EpisodeModel(
                "The Covenant Of Tithing",
                R.drawable.red,
                54,
                "5hr 30mins",
                "30 November 2017"
            ),
            EpisodeModel("The Art of Worship", R.drawable.blue, 54, "1hr", "24 june 2017"),
            EpisodeModel(
                "The Covenant Of Tithing",
                R.drawable.red,
                54,
                "5hr 30mins",
                "30 November 2017"
            ),
            EpisodeModel("The Art of Worship", R.drawable.blue, 54, "1hr", "24 june 2017")
        )
        episodeAdapter = EpisodeAdapter()
        episodeAdapter.setEpisodeData(item)
        episodeAdapter.notifyDataSetChanged()
        episodeRecyclerView.setHasFixedSize(true)
        episodeRecyclerView.adapter=episodeAdapter


        // show add sub category bottom sheet
        addEpisode.setOnClickListener {
            val addEpisodeBottomSheet= AddEpisodeBottomSheet()
            val manager: FragmentManager =
                (this.context as AppCompatActivity).supportFragmentManager
            addEpisodeBottomSheet.show(manager, TAG2)

        }
    }


}