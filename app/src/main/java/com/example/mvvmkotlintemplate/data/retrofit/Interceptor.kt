package com.example.mvvmkotlintemplate.data.retrofit

import okhttp3.Interceptor
import okhttp3.Response

class Interceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response = chain.run {
        val bearerToken = ""
        proceed(request().newBuilder()
            .addHeader("Authorization", bearerToken)
            .addHeader("Content-Type", "application/json")
            .build())
    }
}