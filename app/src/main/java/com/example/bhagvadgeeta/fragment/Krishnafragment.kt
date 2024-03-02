package com.example.bhagvadgeeta.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import com.example.bhagvadgeeta.R
import com.example.bhagvadgeeta.adapter.ViewPagerAdapter


class Krishnafragment : Fragment() {

    lateinit var viewPager: ViewPager
    private val imageurls = arrayListOf(
        "https://t4.ftcdn.net/jpg/05/84/71/27/360_F_584712788_8YTnz4aCk7dIkPEq1qqn90Z1LtVPuWAJ.jpg",
        "https://t4.ftcdn.net/jpg/05/84/71/27/360_F_584712788_8YTnz4aCk7dIkPEq1qqn90Z1LtVPuWAJ.jpg",
        "https://t4.ftcdn.net/jpg/05/84/71/27/360_F_584712788_8YTnz4aCk7dIkPEq1qqn90Z1LtVPuWAJ.jpg"
    )


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?, ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_krishnafragment, container, false)
        initBinding(view)
        return  view
    }

    private fun initBinding(view: View){
        viewPager = view.findViewById<ViewPager>(R.id.imgViewPage)
        var viewPagerAdapter = ViewPagerAdapter(requireActivity(),imageurls)
        viewPager.adapter = viewPagerAdapter
    }
}