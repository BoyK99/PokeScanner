package com.adepthshar.pokescanner.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cards")
data class CardEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String
) {
    val quantity: String
    val price: String
    val imageUrl: Any?
}