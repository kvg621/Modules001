package com.example.modules001

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class mainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val vView:View= inflater.inflate(R.layout.fragment_main, container, false)
        val tText=vView.findViewById<TextView>(R.id.text_view)
        "Новый текст из класса фрагмента".also { tText.text = it }
        return vView
    }


}