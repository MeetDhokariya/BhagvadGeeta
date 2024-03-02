package com.example.bhagvadgeeta.Interface

import android.telecom.Call
import com.example.bhagvadgeeta.ModelClass.GeetaChapterModel
import retrofit2.http.GET
import retrofit2.http.Query


interface GeetaInterface {

    @GET("chapters/")
    fun ChapterAPI(): retrofit2.Call<GeetaChapterModel>

}