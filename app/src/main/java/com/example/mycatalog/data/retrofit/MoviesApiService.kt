package com.example.mycatalog.data.retrofit

import com.example.mycatalog.data.entities.MoviesResponse
import com.google.gson.JsonArray
import retrofit2.http.GET
import retrofit2.http.Query

interface MoviesApiService {
    @GET("last7d.cine.json")
    suspend fun getMovies(): List<MoviesResponse>
}