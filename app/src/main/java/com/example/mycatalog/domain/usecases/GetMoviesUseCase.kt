package com.example.mycatalog.domain.usecases

import com.example.mycatalog.domain.entities.Movie
import com.example.mycatalog.domain.repositories.MoviesRepository
import com.example.mycatalog.domain.usecases.base.UseCase

class GetMoviesUseCase(private val moviesRepository: MoviesRepository) : UseCase<List<Movie>, UseCase.None>() {
    override suspend fun executeOnBackground(input: None): List<Movie> {
        return moviesRepository.getMovies()
    }
}