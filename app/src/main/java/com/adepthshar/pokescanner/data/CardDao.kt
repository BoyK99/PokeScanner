package com.adepthshar.pokescanner.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.adepthshar.pokescanner.data.entities.CardEntity

@Dao
interface CardDao {

    @Insert
    suspend fun insert(card: CardEntity)

    @Query("SELECT * FROM cards")
    suspend fun getAll(): List<CardEntity>
}