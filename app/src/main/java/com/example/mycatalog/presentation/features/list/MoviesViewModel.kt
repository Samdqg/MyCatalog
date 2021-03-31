package com.example.mycatalog.presentation.features.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mycatalog.domain.entities.Movie
import com.example.mycatalog.domain.usecases.GetMoviesUseCase
import com.example.mycatalog.domain.usecases.base.UseCase
import com.example.mycatalog.presentation.injection.DaggerMoviesComponent
import com.example.mycatalog.presentation.injection.MoviesComponent
import com.example.mycatalog.presentation.injection.MoviesModule
import java.lang.Exception
import javax.inject.Inject

class MoviesViewModel: ViewModel() {

    private val moviesComponent: MoviesComponent = DaggerMoviesComponent
        .builder()
        .moviesModule(MoviesModule())
        .build()

    init {
        moviesComponent.inject(this)
    }

    @Inject
    lateinit var getMoviesUseCase: GetMoviesUseCase

    private val movies: MutableLiveData<List<Movie>> = MutableLiveData()
    private val exception: MutableLiveData<Exception> = MutableLiveData()

    fun getMovies(): LiveData<List<Movie>>{
        return movies
    }

    fun getException(): LiveData<Exception>{
        return exception
    }

    fun getMovieList(){
        getMoviesUseCase.execute({
            onComplete {
                movies.value = it
            }
            onError {
                exception.value = it
            }
        }, UseCase.None())
    }
}