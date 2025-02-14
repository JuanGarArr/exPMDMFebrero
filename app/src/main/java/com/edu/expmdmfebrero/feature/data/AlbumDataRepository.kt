package com.edu.expmdmfebrero.feature.data

import com.edu.expmdmfebrero.feature.domain.Album
import com.edu.expmdmfebrero.feature.domain.Card
import com.edu.expmdmfebrero.feature.domain.Repository
import org.koin.core.annotation.Single

@Single
class AlbumDataRepository(
    private val mock: AlbumMockDataSource
) : Repository {

    override fun getAlbums(): List<Album> {
        return mock.getAlbums()
    }

    override fun getCardsByAlbum(albumId: String): List<Card> {
        return mock.getCardsByAlbum(albumId)
    }

}