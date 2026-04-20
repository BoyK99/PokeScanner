package com.adepthshar.pokescanner.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.adepthshar.pokescanner.data.remote.PokemonCard

@Dao
interface CardDao {

    @Query("SELECT * FROM PokemonCard")
    suspend fun getAll(): List<PokemonCard>

    @Insert
    suspend fun insertAll(cards: List<PokemonCard>)
}