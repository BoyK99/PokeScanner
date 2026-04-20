package com.adepthshar.pokescanner.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.adepthshar.pokescanner.data.entities.CardEntity

@Database(entities = [CardEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun cardDao(): CardDao
}