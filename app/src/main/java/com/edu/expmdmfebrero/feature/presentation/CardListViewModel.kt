package com.edu.expmdmfebrero.feature.presentation

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.edu.expmdmfebrero.feature.domain.Card
import com.edu.expmdmfebrero.feature.domain.GetCardsByAlbumUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.android.annotation.KoinViewModel

@KoinViewModel
class CardListViewModel(
    private val getCard: GetCardsByAlbumUseCase
) : ViewModel() {

    private val _uiState = MutableLiveData<UiState>()
    val uiState: LiveData<UiState> = _uiState

    fun loadCards(albumId: String) {
        _uiState.value = UiState(isLoading = true)
        viewModelScope.launch(Dispatchers.IO) {
            val cards = getCard.invoke(albumId)
            _uiState.postValue(UiState(cards))
        }

    }

    data class UiState(
        val cards: List<Card> = emptyList(),
        val isLoading: Boolean = false
    )

}