package com.udemy.myapplication.presentation.di.core

import com.udemy.myapplication.data.api.TMDBService
import com.udemy.myapplication.data.repository.artist.datasource.ArtistRemoteDatasource
import com.udemy.myapplication.data.repository.artist.datasourceImpl.ArtistRemoteDatasourceImpl
import com.udemy.myapplication.data.repository.movie.datasource.MovieRemoteDatasource
import com.udemy.myapplication.data.repository.movie.datasourceImpl.MovieRemoteDatasourceImpl
import com.udemy.myapplication.data.repository.tvshow.datasource.TvShowRemoteDatasource
import com.udemy.myapplication.data.repository.tvshow.datasourceImpl.TvShowRemoteDatasourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule(private val apiKey: String) {

    @Singleton
    @Provides
    fun provideMovieRemoteDatasource(tmdbService: TMDBService): MovieRemoteDatasource {
        return MovieRemoteDatasourceImpl(tmdbService, apiKey)
    }

    @Singleton
    @Provides
    fun provideTvShowRemoteDatasource(tmdbService: TMDBService): TvShowRemoteDatasource {
        return TvShowRemoteDatasourceImpl(tmdbService, apiKey)
    }

    @Singleton
    @Provides
    fun provideArtistRemoteDatasource(tmdbService: TMDBService): ArtistRemoteDatasource {
        return ArtistRemoteDatasourceImpl(tmdbService, apiKey)
    }
}