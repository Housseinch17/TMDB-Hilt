package com.anushka.tmdbclient.data.repository.movie

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named

@Module
    @InstallIn(SingletonComponent::class)
    class ApiDataModule {

        @Provides
        fun getApiKeys() : ApiData{
            return ApiData("")
        }

        @Named("f")
        @Provides
        fun getApiKey(apiData: ApiData) : ApiData{
            return ApiData(apiData.apiKey)
        }
    }