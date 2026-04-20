@Entity(tableName = "cards")
data class CardEntity(
    @PrimaryKey val id: String,
    val name: String,
    val imageUrl: String,
    val price: Double,
    val quantity: Int
)