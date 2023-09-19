package com.anushka.tmdbclient.data.repository.movie

import javax.inject.Inject

class ApiData (var apiKey: String) {
    fun printApi(){
        println("Print api "+ apiKey)
    }
}