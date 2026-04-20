package com.adepthshar.pokescanner.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.adepthshar.pokescanner.data.remote.PokemonCard

@Database(entities = [PokemonCard::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun cardDao(): CardDao
}