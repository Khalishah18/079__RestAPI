package com.example.consumerestapi.ui.kontak

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.consumerestapi.repository.KontakRepository
import com.example.consumerestapi.ui.home.viewmodel.InsertUiEvent
import com.example.consumerestapi.ui.home.viewmodel.InsertUiState

class InsertViewModel (private val kontakRepository: KontakRepository) : ViewModel() {

    val insertKontakState by mutableStateOf(InsertUiState())
        private set
    fun updateInsertKontakState(insertUiEvent: InsertUiEvent){
        insertKontakState = InsertUiState(insertUiEvent = insertUiEvent)
    }
}