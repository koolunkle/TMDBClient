package com.udemy.myapplication.presentation.di.movie

import com.udemy.myapplication.domain.usecase.GetMoviesUseCase
import com.udemy.myapplication.domain.usecase.UpdateMoviesUseCase
import com.udemy.myapplication.presentation.movie.MovieViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MovieModule {

    @MovieScope
    @Provides
    fun provideMovieViewModelFactory(
        getMoviesUseCase: GetMoviesUseCase, updateMoviesUseCase: UpdateMoviesUseCase
    ): MovieViewModelFactory {
        return MovieViewModelFactory(getMoviesUseCase, updateMoviesUseCase)
    }
}