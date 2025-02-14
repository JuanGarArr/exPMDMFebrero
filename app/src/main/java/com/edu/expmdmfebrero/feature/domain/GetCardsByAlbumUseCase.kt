package com.edu.expmdmfebrero.feature.domain

import org.koin.core.annotation.Single

@Single
class GetCardsByAlbumUseCase(private val repository: Repository) {
    operator fun invoke(albumId: String): List<Card> = repository.getCardsByAlbum(albumId)
}