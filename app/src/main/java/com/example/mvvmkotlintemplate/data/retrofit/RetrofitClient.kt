package com.example.mvvmkotlintemplate.data.retrofit

import com.example.mvvmkotlintemplate.data.dataService.RetrofitService
import retrofit2.Retrofit

class RetrofitClient {

    fun getClient() : RetrofitService {
        return retrofitService
    }

    private val baseUrl = ""

    private val retrofit : Retrofit =
        Retrofit.Builder()
            .baseUrl(baseUrl)
            .build()

    private val retrofitService : RetrofitService by lazy {
        retrofit.create(RetrofitService::class.java)
    }
}