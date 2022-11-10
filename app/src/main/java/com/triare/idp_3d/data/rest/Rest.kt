package com.triare.idp_3d.data.rest

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.triare.idp_3d.BuildConfig.BASE_URL
import com.triare.idp_3d.data.rest.service.DrinkService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Rest {

    private val gson: Gson by lazy {
        GsonBuilder()
            .setLenient()
            .create()
    }
    private val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
    }
    val apiService: DrinkService by lazy {
        retrofit.create(DrinkService::class.java)
    }
}