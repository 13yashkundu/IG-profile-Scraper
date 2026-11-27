package com.example.scraper

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

data class HomeUiState(
    val profileInfo : profileInfo? = null,
    val isSearching : Boolean = false,
    val errMsg : String = ""
)

class Home_ViewModel : ViewModel() {
    val _uiState = MutableStateFlow(HomeUiState())
    val uiState = _uiState.asStateFlow()

    val repository : Home_Repository = Home_Repository()

    fun getProfile( userName : String){
        viewModelScope.launch {
            val cleanUsername = userName.trim()
            if (cleanUsername.isEmpty()){
                _uiState.value = _uiState.value.copy(errMsg = "Enter a valid username")
                return@launch
            }
            repository.getProfile(cleanUsername)
        }
    }

}