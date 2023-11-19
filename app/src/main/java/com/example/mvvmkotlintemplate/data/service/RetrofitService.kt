package com.example.mvvmkotlintemplate.data.service

import com.example.mvvmkotlintemplate.data.models.Product
import okhttp3.Call
import okhttp3.Response
import retrofit2.http.GET

interface RetrofitService {

    @GET("Product")
    fun getProduct() : Product
}