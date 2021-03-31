package com.example.mycatalog.presentation.injection

import com.example.mycatalog.presentation.features.list.MoviesViewModel
import dagger.Component

@Component(modules = [MoviesModule::class])
interface MoviesComponent {
    fun inject(viewModel: MoviesViewModel)
}