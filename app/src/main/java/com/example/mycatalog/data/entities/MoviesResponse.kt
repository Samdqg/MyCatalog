package com.example.mycatalog.data.entities

import com.example.mycatalog.domain.entities.Movie

data class MoviesResponse (
    val totalCount: Int,
    val shows: List<Movie>
)