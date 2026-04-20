data class PokemonResponse(
    val data: List<PokemonCard>
)

data class PokemonCard(
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