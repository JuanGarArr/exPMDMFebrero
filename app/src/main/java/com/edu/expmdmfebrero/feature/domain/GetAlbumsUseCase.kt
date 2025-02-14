package com.edu.expmdmfebrero.feature.domain

import org.koin.core.annotation.Single

@Single
class GetAlbumsUseCase(private val repository: Repository) {
    operator fun invoke(): List<Album> = repository.getAlbums()
}