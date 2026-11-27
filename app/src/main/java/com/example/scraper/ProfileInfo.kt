package com.example.scraper

data class profileInfo(
    val username : String,
    val fullName : String,
    val avatarUrl : String,
    val biography : String,
    val postsCount : Int,
    val followersCount : Int,
    val followingCount : Int,
    val externalUrl : String
)