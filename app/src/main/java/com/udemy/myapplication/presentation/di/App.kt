package com.udemy.myapplication.presentation.di

import android.app.Application
import com.udemy.myapplication.BuildConfig
import com.udemy.myapplication.presentation.di.artist.ArtistSubComponent
import com.udemy.myapplication.presentation.di.core.*
import com.udemy.myapplication.presentation.di.movie.MovieSubComponent
import com.udemy.myapplication.presentation.di.tvshow.TvShowSubComponent

class App : Application(), Injector {

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder().appModule(AppModule(applicationContext))
            .netModule(NetModule(BuildConfig.BASE_URL))
            .remoteDataModule(RemoteDataModule(BuildConfig.API_KEY)).build()
    }

    override fun createMovieSubComponent(): MovieSubComponent {
        return appComponent.movieSubComponent().create()
    }

    override fun createTvShowSubComponent(): TvShowSubComponent {
        return appComponent.tvShowSubComponent().create()
    }

    override fun createArtistSubComponent(): ArtistSubComponent {
        return appComponent.artistSubComponent().create()
    }
}