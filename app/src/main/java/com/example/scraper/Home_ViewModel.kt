package com.example.scraper

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

data class HomeUiState(
    val profileInfo : profileInfo? = null,
    val isSearching : Boolean = false,
    val errMsg : String = ""
)

class Home_ViewModel : ViewModel() {
    val _uiState = MutableStateFlow(HomeUiState())
    val uiState = _uiState.asStateFlow()
}