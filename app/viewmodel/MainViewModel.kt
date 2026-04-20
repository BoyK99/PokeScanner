class MainViewModel(
    private val dao: CardDao
) : ViewModel() {

    val cards = dao.getAll().stateIn(
        viewModelScope,
        SharingStarted.WhileSubscribed(),
        emptyList()
    )

    fun scanCard() {
        viewModelScope.launch {
            val query = recognizeCard()

            val result = ApiClient.api.searchCards("name:$query")
            val card = result.data.firstOrNull() ?: return@launch

            val price = card.cardmarket?.prices?.averageSellPrice ?: 0.0

            dao.insert(
                CardEntity(
                    id = card.id,
                    name = card.name,
                    imageUrl = card.images.small,
                    price = price
                )
            )
        }
    }
}