package com.example.mycatalog.data.repositories

import android.util.Log
import com.example.mycatalog.data.retrofit.MoviesApiService
import com.example.mycatalog.data.retrofit.RetrofitBase
import com.example.mycatalog.domain.entities.Movie
import com.example.mycatalog.domain.repositories.MoviesRepository
import retrofit2.create

class MoviesRepositoryImpl: MoviesRepository {

    val retrofit = RetrofitBase.getRetrofitInstance()
    val moviesApiService = retrofit.create<MoviesApiService>()

    override suspend fun getMovies(): List<Movie> {
        val response = moviesApiService.getMovies()
        Log.d("test","test")
        return ArrayList()
    }
}