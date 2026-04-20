package com.adepthshar.pokescanner.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.adepthshar.pokescanner.data.remote.ApiClient
import com.adepthshar.pokescanner.data.remote.PokemonCard
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    var cards: List<PokemonCard> = emptyList()

    fun loadCards() {
        viewModelScope.launch {
            cards = ApiClient.api.getCards().data
        }
    }
}