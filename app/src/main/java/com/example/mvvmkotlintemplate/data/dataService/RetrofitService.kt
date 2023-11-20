package com.example.mvvmkotlintemplate.data.dataService

import com.example.mvvmkotlintemplate.data.models.Product
import retrofit2.http.GET

interface RetrofitService {

    @GET("Product")
    fun getProduct() : Product
}