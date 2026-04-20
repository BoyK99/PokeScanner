package com.adepthshar.pokescanner.data.remote

data class PokemonResponse(
    val data: List<PokemonCardDto>
)

data class PokemonCardDto(
    val id: String,
    val name: String,
    val images: Images,
    val cardmarket: CardMarket?
)

data class Images(
    val small: String
)

data class CardMarket(
    val prices: Prices?
)

data class Prices(
    val averageSellPrice: Double?
)