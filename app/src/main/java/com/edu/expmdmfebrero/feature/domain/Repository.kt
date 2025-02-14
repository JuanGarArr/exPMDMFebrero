package com.edu.expmdmfebrero.feature.domain

interface Repository {
    fun getAlbums(): List<Album>
    fun getCardsByAlbum(albumId: String): List<Card>
}
