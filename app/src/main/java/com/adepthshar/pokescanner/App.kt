package com.adepthshar.pokescanner

import android.app.Application
import androidx.room.Room
import com.adepthshar.pokescanner.data.AppDatabase

class App : Application() {

    companion object {
        lateinit var database: AppDatabase
            private set
    }

    override fun onCreate() {
        super.onCreate()

        database = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "pokemon_db"
        ).build()
    }
}