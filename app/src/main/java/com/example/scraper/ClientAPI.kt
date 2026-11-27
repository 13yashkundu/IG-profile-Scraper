package com.example.scraper

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ClientAPI {
    private val url = "https://scraperapi.to/scrape/instagram-scraper/"

    val retrofit = Retrofit.Builder()
        .baseUrl(url)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val instagramAPI = retrofit.create(API::class.java)
}