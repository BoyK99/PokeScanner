package com.adepthshar.pokescanner.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.adepthshar.pokescanner.data.entities.CardEntity

@Composable
fun LibraryScreen(cards: List<CardEntity>) {
    LazyColumn {
        items(cards) { card ->
            Row(modifier = Modifier.padding(8.dp)) {
                AsyncImage(
                    model = card.imageUrl,
                    contentDescription = null,
                    modifier = Modifier.size(80.dp)
                )
                Column {
                    Text(card.name)
                    Text("€${card.price}")
                    Text("Owned: ${card.quantity}")
                }
            }
        }
    }
}