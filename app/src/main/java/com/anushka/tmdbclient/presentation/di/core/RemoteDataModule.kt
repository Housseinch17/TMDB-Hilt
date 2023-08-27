package com.anushka.tmdbclient.presentation.di.core

import android.util.Log
import com.anushka.tmdbclient.BuildConfig
import com.anushka.tmdbclient.data.api.TMDBService
import com.anushka.tmdbclient.data.repository.artist.datasource.ArtistRemoteDatasource
import com.anushka.tmdbclient.data.repository.artist.datasourceImpl.ArtistRemoteDataSourceImpl
import com.anushka.tmdbclient.data.repository.movie.datasource.MovieRemoteDatasource
import com.anushka.tmdbclient.data.repository.movie.datasourceImpl.MovieRemoteDataSourceImpl
import com.anushka.tmdbclient.data.repository.tvshow.datasource.TvShowRemoteDatasource
import com.anushka.tmdbclient.data.repository.tvshow.datasourceImpl.TvShowRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Qualifier
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RemoteDataModule() {

/*    @Qualifier
    @Retention(AnnotationRetention.BINARY)
    annotation class ApiKeyMovie

    private var apiKeyMovie: String = "d"

    fun setApiKeys(apiKeyMovie: String) {
        this.apiKeyMovie = apiKeyMovie
    }

    @Singleton
    @Provides
    fun provideRemoteDataModule(): RemoteDataModule {
        return this
    }

    @ApiKeyMovie
    @Provides
    fun provideApiKeyMovie(): String = apiKeyMovie

    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(tmdbService: TMDBService,@ApiKeyMovie apiKeyMovie: String
    ): MovieRemoteDatasource {
        Log.d("apiMovie",apiKeyMovie)
        return MovieRemoteDataSourceImpl(
            tmdbService, apiKeyMovie
        )
    }*/
    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(tmdbService: TMDBService): MovieRemoteDatasource {
        return MovieRemoteDataSourceImpl(
            tmdbService, BuildConfig.API_KEY
        )
    }

    @Singleton
    @Provides
    fun provideTvRemoteDataSource(tmdbService: TMDBService): TvShowRemoteDatasource {
        return TvShowRemoteDataSourceImpl(
            tmdbService, BuildConfig.API_KEY
        )
    }

    @Singleton
    @Provides
    fun provideArtistRemoteDataSource(tmdbService: TMDBService): ArtistRemoteDatasource {
        return ArtistRemoteDataSourceImpl(
            tmdbService, BuildConfig.API_KEY
        )
    }


}