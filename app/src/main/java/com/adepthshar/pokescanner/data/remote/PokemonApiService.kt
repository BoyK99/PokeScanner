package com.adepthshar.pokescanner.data.remote

import retrofit2.http.GET
import retrofit2.http.Query

interface PokemonApiService {

    @GET("v2/cards")
    suspend fun searchCards(
        @Query("q") query: String
    ): PokemonResponse
}