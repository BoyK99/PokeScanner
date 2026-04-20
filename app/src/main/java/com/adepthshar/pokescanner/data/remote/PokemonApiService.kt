package com.adepthshar.pokescanner.data.remote

import retrofit2.http.GET

interface PokemonApiService {
    @GET("v2/cards")
    suspend fun getCards(): PokemonResponse
}