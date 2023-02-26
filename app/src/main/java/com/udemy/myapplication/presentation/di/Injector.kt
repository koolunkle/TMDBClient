package com.udemy.myapplication.presentation.di

import com.udemy.myapplication.presentation.di.artist.ArtistSubComponent
import com.udemy.myapplication.presentation.di.movie.MovieSubComponent
import com.udemy.myapplication.presentation.di.tvshow.TvShowSubComponent

interface Injector {

    fun createMovieSubComponent(): MovieSubComponent
    fun createTvShowSubComponent(): TvShowSubComponent
    fun createArtistSubComponent(): ArtistSubComponent
}