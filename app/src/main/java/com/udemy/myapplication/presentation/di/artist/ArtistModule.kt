package com.udemy.myapplication.presentation.di.artist

import com.udemy.myapplication.domain.usecase.GetArtistsUseCase
import com.udemy.myapplication.domain.usecase.UpdateArtistsUseCase
import com.udemy.myapplication.presentation.artist.ArtistViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class ArtistModule {

    @ArtistScope
    @Provides
    fun provideArtistViewModelFactory(
        getArtistsUseCase: GetArtistsUseCase, updateArtistsUseCase: UpdateArtistsUseCase
    ): ArtistViewModelFactory {
        return ArtistViewModelFactory(getArtistsUseCase, updateArtistsUseCase)
    }
}