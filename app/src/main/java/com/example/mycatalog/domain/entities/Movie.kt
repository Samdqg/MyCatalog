package com.example.mycatalog.domain.entities

class Movie (
    val actors: List<String>,
    val country: List<String>,
    val directors: List<String>,
    val moviePictures: MoviePictures,
    val synopsisEpisode: String,
    val title: String
)