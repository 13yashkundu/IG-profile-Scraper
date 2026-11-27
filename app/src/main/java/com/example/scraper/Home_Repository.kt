package com.example.scraper

import com.google.gson.JsonObject
import retrofit2.Response

class Home_Repository {
    suspend fun getProfile(apiKey : String ,username : String) : Response<JsonObject>{
        return ClientAPI.instagramAPI.getProfile(
            authorization = "Bearer $apiKey",
            userRequest(username))
    }
}