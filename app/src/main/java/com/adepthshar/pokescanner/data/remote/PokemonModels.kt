package com.adepthshar.pokescanner.data.remote

data class PokemonResponse(
    val data: List<PokemonCard>
)

data class PokemonCard(
    val id: String,
    val name: String,
    val images: Images
)

data class Images(
    val small: String
)