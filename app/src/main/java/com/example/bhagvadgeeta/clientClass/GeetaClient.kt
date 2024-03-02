package com.example.bhagvadgeeta.clientClass

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class GeetaClient {

     companion object{

         var retrofit:Retrofit? = null
         val  Baseurl = "https://bhagavad-gita3.p.rapidapi.com/v2/"

         fun getApiClient() : Retrofit?{
             if (retrofit  == null){
                 retrofit = Retrofit.Builder().baseUrl(Baseurl).addConverterFactory(GsonConverterFactory.create()).build()
             }
                return retrofit
         }

     }


}