package com.prathamngundikere.dummy.data

import com.prathamngundikere.dummy.data.model.Products
import retrofit2.http.GET

interface Api {
    @GET("products")
    suspend fun getProductsList(): Products
    companion object {
        const val BASE_URL = "https://dummyjson.com/"
    }
}