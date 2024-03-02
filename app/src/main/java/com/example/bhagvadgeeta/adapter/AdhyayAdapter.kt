package com.example.bhagvadgeeta.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.bhagvadgeeta.ChapterActivity
import com.example.bhagvadgeeta.ModelClass.GeetaChapterModel
import com.example.bhagvadgeeta.ModelClass.GeetaChapterModelItem
import com.example.bhagvadgeeta.R

class AdhyayAdapter(val chapterActivity : ChapterActivity,val chapter: List<GeetaChapterModelItem?>): RecyclerView.Adapter<AdhyayAdapter.ViewDataHolder>() {

        class ViewDataHolder(itemView: View): ViewHolder(itemView)
        {
            var ChapterName = itemView.findViewById<TextView>(R.id.ChapterName)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewDataHolder {
   var view = LayoutInflater.from(chapterActivity).inflate(R.layout.chapter_tile,parent,false)
        return ViewDataHolder(view)
    }
    override fun getItemCount(): Int {
       return chapter!!.size
    }

    override fun onBindViewHolder(holder: ViewDataHolder, position: Int) {
        holder.ChapterName.setText(chapter.get(position)!!.name)
    }
}