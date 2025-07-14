package com.example.alromaihassignment.feature_products.data.remote.service

import com.example.alromaihassignment.feature_products.data.models.ProductDetailsResponse
import com.example.alromaihassignment.feature_products.data.models.ProductsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ProductService {
    @GET("v1/images/search?size=small&has_breeds=true&order=RANDOM&page=0")
    suspend fun fetchProducts(
        @Query("limit") limit: Int
    ): Response<List<ProductsResponse>>

    @GET("v1/favourites")
    suspend fun fetchProductDetails(
        @Query("id") subId: String
    ): Response<List<ProductDetailsResponse>>
}