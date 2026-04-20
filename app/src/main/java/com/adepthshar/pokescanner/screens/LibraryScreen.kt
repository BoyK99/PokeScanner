package com.adepthshar.pokescanner

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