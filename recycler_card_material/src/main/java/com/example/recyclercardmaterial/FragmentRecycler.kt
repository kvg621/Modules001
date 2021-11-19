package com.example.recyclercardmaterial

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FragmentRecycler : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val vIewFragment = inflater.inflate(R.layout.fragment_recycler, container, false)


        val bannerList: List<Banner> = listOf(
            Banner(R.drawable.banner_image, "Hello"),
            Banner(R.drawable.banner_image, "Hello001"),
            Banner(R.drawable.banner_image, "Hello002")
        )


        val userRecyclerView: RecyclerView = vIewFragment.findViewById(R.id.user_recycler_view)
        userRecyclerView.layoutManager =
            LinearLayoutManager(vIewFragment.context, LinearLayoutManager.VERTICAL, false)
        userRecyclerView.addItemDecoration(
            DividerItemDecoration(
                vIewFragment.context,
                DividerItemDecoration.VERTICAL
            )
        )

        userRecyclerView.adapter = BannerAdapter(bannerList)
        return vIewFragment
    }
}


//Adapter - натягивает View на RecyclerView
//ViewHolder - натягивает данные на View