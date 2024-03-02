package com.example.bhagvadgeeta.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.viewpager.widget.PagerAdapter
import com.bumptech.glide.Glide
import com.example.bhagvadgeeta.R
import java.util.Objects


class ViewPagerAdapter(val context: Activity,val imageList: ArrayList<String>): PagerAdapter() {
    override fun getCount(): Int {
        return imageList.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view== `object` as LinearLayout
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        var view = LayoutInflater.from(context).inflate(R.layout.viewpage,container,false)
        var imageViewPage = view.findViewById<ImageView>(R.id.imgViewPage)
        Glide.with(context).load(imageList.get(position)).into(imageViewPage)
        Objects.requireNonNull(container).addView(view)

        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView( `object` as LinearLayout)
    }
}