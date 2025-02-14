package com.edu.expmdmfebrero.feature.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.edu.expmdmfebrero.feature.domain.Album
import com.edu.expmdmfebrero.feature.domain.GetAlbumsUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.android.annotation.KoinViewModel


@KoinViewModel
class AlbumListViewModel(
    private val getAlbums: GetAlbumsUseCase
) : ViewModel() {

    private val favorites = mutableSetOf<String>()

    private val _uiState = MutableLiveData<UiState>()
    val uiState: LiveData<UiState> = _uiState

    fun loadAlbums() {
        _uiState.value = UiState(isLoading = true)
        viewModelScope.launch(Dispatchers.IO) {
            val albums = getAlbums.invoke().map { album ->
                album.copy(isFavourite = favorites.contains(album.id))
            }
            _uiState.postValue(UiState(albums))
        }
    }

    fun updateFavorite(updatedAlbum: Album) {
        if (updatedAlbum.isFavourite) {
            favorites.add(updatedAlbum.id)
        } else {
            favorites.remove(updatedAlbum.id)
        }
        val currentAlbums = _uiState.value?.albums ?: emptyList()
        val newAlbums = currentAlbums.map { album ->
            album.copy(isFavourite = favorites.contains(album.id))
        }
        _uiState.value = UiState(albums = newAlbums)
    }

    data class UiState(
        val albums: List<Album> = emptyList(),
        val isLoading: Boolean = false
    )
}



