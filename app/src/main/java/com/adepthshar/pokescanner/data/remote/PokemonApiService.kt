interface PokemonApiService {

    @GET("v2/cards")
    suspend fun searchCards(
        @Query("q") query: String
    ): PokemonResponse
}