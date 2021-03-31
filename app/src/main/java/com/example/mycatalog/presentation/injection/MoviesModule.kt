package com.example.mycatalog.presentation.injection

import com.example.mycatalog.data.repositories.MoviesRepositoryImpl
import com.example.mycatalog.domain.repositories.MoviesRepository
import com.example.mycatalog.domain.usecases.GetMoviesUseCase
import dagger.Module
import dagger.Provides

@Module
class MoviesModule {

    @Provides
    fun provideMoviesRepository(): MoviesRepository{
        return MoviesRepositoryImpl()
    }

    @Provides
    fun provideGetMoviesUseCase(moviesRepository: MoviesRepository): GetMoviesUseCase{
        return GetMoviesUseCase(moviesRepository)
    }
}