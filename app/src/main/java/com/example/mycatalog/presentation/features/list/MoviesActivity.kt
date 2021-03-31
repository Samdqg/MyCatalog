package com.example.mycatalog.presentation.features.list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mycatalog.R

class MoviesActivity : AppCompatActivity() {

    private lateinit var viewModel: MoviesViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MoviesViewModel::class.java)
        initObservers()
    }

    fun initObservers(){
        viewModel.getMovies().observe(this, Observer {
            Toast.makeText(this, "success", Toast.LENGTH_SHORT).show()
        })

        viewModel.getException().observe(this, Observer {
            Toast.makeText(this, "error", Toast.LENGTH_SHORT).show()
        })
    }

    override fun onStart() {
        super.onStart()
        viewModel.getMovieList()
    }
}