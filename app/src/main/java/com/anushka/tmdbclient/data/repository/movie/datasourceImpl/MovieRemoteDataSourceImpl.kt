package com.anushka.tmdbclient.data.repository.movie.datasourceImpl

import com.anushka.tmdbclient.data.api.TMDBService
import com.anushka.tmdbclient.data.model.movie.MovieList
import com.anushka.tmdbclient.data.repository.movie.MovieConstant
import com.anushka.tmdbclient.data.repository.movie.datasource.MovieRemoteDatasource
import retrofit2.Response
import javax.inject.Inject

class MovieRemoteDataSourceImpl (
    private val tmdbService: TMDBService,
    private var apiKey : String
): MovieRemoteDatasource {
    override suspend fun getMovies(): Response<MovieList> {
        apiKey = MovieConstant.movieApiKey
        return tmdbService.getPopularMovies(apiKey)
}
}

