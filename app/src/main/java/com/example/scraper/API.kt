package com.example.scraper

import com.google.gson.JsonObject
import okhttp3.Response
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.POST

data class userRequest(
    val username : String
)

interface API {
    @Headers("Content-Type\": \"application/json")
    @POST("instagram-scraper/userInfo")
    suspend fun getProfile(
        @Header("Authorization") authorization : String,
        @Body response : userRequest
    ): Response<JsonObject>
}