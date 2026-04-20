@Dao
interface CardDao {

    @Query("SELECT * FROM cards")
    fun getAll(): Flow<List<CardEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(card: CardEntity)

    @Query("UPDATE cards SET quantity = quantity + 1 WHERE id = :id")
    suspend fun increment(id: String)
}