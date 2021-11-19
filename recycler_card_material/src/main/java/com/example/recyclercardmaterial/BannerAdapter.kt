package com.example.recyclercardmaterial

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class BannerAdapter(private val bannerList: List<Banner>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val bannerView = LayoutInflater.from(parent.context)
            .inflate(R.layout.banner_card_list_item, parent, false)

        return BannerViewHolder(bannerView)
    }

    override fun onBindViewHolder(holder: BannerViewHolder, position: Int) {
       val banner=bannerList[position]
        holder.bind(banner)
    }

    override fun getItemCount(): Int {
        return bannerList.size
    }
}