package com.adepthshar.pokescanner.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.adepthshar.pokescanner.App
import com.adepthshar.pokescanner.data.entities.CardEntity
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    private val dao = App.database.cardDao()

    fun addCard(name: String) {
        viewModelScope.launch {
            dao.insert(CardEntity(name = name))
        }
    }
}