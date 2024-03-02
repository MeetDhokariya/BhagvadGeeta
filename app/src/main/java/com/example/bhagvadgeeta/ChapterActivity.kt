package com.example.bhagvadgeeta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bhagvadgeeta.Interface.GeetaInterface
import com.example.bhagvadgeeta.ModelClass.GeetaChapterModel
import com.example.bhagvadgeeta.ModelClass.GeetaChapterModelItem
import com.example.bhagvadgeeta.adapter.AdhyayAdapter
import com.example.bhagvadgeeta.clientClass.GeetaClient
import com.example.bhagvadgeeta.databinding.ActivityChapterBinding
import com.example.bhagvadgeeta.fragment.Krishnafragment
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

lateinit var binding : ActivityChapterBinding
class ChapterActivity : AppCompatActivity() {

    var geetaChapterModel:GeetaChapterModel? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChapterBinding.inflate(layoutInflater)
        setContentView(binding.root)
//
//        var krishnafragment = Krishnafragment()
//       replaceFragment(krishnafragment)


    }
    fun setData()
    {
       var adapter = AdhyayAdapter(this@ChapterActivity, geetaChapterModel!!.geetaChapterModel!!)
        var lm = LinearLayoutManager(this)
        binding.rvadhyay.layoutManager = lm
        binding.rvadhyay.adapter=adapter

    }


    fun getChapterApi() {
        var apiInterface = GeetaClient.getApiClient()!!.create(GeetaInterface::class.java)
         apiInterface.ChapterAPI().enqueue(object : retrofit2.Callback<GeetaChapterModel?> {
             override fun onResponse(call: Call<GeetaChapterModel?>?, response: Response<GeetaChapterModel?>?, ) {

                 if (response!!.code()==200) {

                     geetaChapterModel = response.body()
                     setData()
                     Log.i("TAG", "onResponse: ${response.message()}")
                 }
             }

             override fun onFailure(call: Call<GeetaChapterModel?>?, t: Throwable?) {
                 Log.e("TAG", "onFailure: ${t!!.message}", )
             }
         })
        }
    }




//    private  fun replaceFragment(fragment: Fragment){
//        var fragmentTrasistion = supportFragmentManager.beginTransaction()
//        fragmentTrasistion.replace(R.id.Fragment,fragment)
//        fragmentTrasistion.addToBackStack(null)
//        fragmentTrasistion.commit()
//    }


