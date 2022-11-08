package com.example.gd10_d_10362

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RClient {
    private const val BASE_URL = "10.53.5.51"
    val instances:api by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        retrofit.create(api::class.java)
    }
}
