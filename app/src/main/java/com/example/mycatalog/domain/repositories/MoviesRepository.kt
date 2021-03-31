package com.example.mycatalog.domain.repositories

import com.example.mycatalog.domain.entities.Movie

interface MoviesRepository {
    suspend fun getMovies(): List<Movie>
}