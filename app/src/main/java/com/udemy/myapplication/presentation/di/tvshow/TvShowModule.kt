package com.udemy.myapplication.presentation.di.tvshow

import com.udemy.myapplication.domain.usecase.GetTvShowsUseCase
import com.udemy.myapplication.domain.usecase.UpdateTvShowsUseCase
import com.udemy.myapplication.presentation.tvshow.TvShowViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class TvShowModule {

    @TvShowScope
    @Provides
    fun provideTvShowViewModelFactory(
        getTvShowsUseCase: GetTvShowsUseCase, updateTvShowsUseCase: UpdateTvShowsUseCase
    ): TvShowViewModelFactory {
        return TvShowViewModelFactory(getTvShowsUseCase, updateTvShowsUseCase)
    }
}