package com.edu.expmdmfebrero.feature.data

import com.edu.expmdmfebrero.feature.domain.Album
import com.edu.expmdmfebrero.feature.domain.Card
import org.koin.core.annotation.Single

@Single
class AlbumMockDataSource {

    private val mockAlbums: List<Album> = listOf(
        Album(
            id = "1",
            name = "Edible Mushrooms",
            creationDate = "2025-01-01",
            description = "A collection of common edible mushrooms.",
            imgUrl = "https://example.com/images/edible_mushrooms.jpg",
            isFavourite = false
        ),
        Album(
            id = "2",
            name = "Poisonous Mushrooms",
            creationDate = "2025-01-02",
            description = "A collection of common poisonous mushrooms.",
            imgUrl = "https://example.com/images/poisonous_mushrooms.jpg",
            isFavourite = false
        ),
        Album(
            id = "3",
            name = "Medicinal Mushrooms",
            creationDate = "2025-01-03",
            description = "A collection of mushrooms with medicinal properties.",
            imgUrl = "https://example.com/images/medicinal_mushrooms.jpg",
            isFavourite = false
        ),
        Album(
            id = "4",
            name = "Mycorrhizal Mushrooms",
            creationDate = "2025-01-04",
            description = "A collection of mushrooms that form symbiotic relationships with plants.",
            imgUrl = "https://example.com/images/mycorrhizal_mushrooms.jpg",
            isFavourite = false
        ),
        Album(
            id = "5",
            name = "Bioluminescent Mushrooms",
            creationDate = "2025-01-05",
            description = "A collection of mushrooms that emit light.",
            imgUrl = "https://example.com/images/bioluminescent_mushrooms.jpg",
            isFavourite = false
        ),
        Album(
            id = "6",
            name = "Rare Mushrooms",
            creationDate = "2025-01-06",
            description = "A collection of rare and exotic mushrooms.",
            imgUrl = "https://example.com/images/rare_mushrooms.jpg",
            isFavourite = false
        ),
        Album(
            id = "7",
            name = "Mushrooms in Art",
            creationDate = "2025-01-07",
            description = "A collection of artistic representations of mushrooms.",
            imgUrl = "https://example.com/images/mushrooms_in_art.jpg",
            isFavourite = false
        ),
        Album(
            id = "8",
            name = "Historical Uses of Mushrooms",
            creationDate = "2025-01-08",
            description = "A collection of historical uses of mushrooms.",
            imgUrl = "https://example.com/images/historical_uses_of_mushrooms.jpg",
            isFavourite = false
        ),
        Album(
            id = "9",
            name = "Psychedelic Mushrooms",
            creationDate = "2025-01-09",
            description = "A collection of mushrooms with psychedelic properties.",
            imgUrl = "https://example.com/images/psychedelic_mushrooms.jpg",
            isFavourite = false
        ),
        Album(
            id = "10",
            name = "Forest Mushrooms",
            creationDate = "2025-01-10",
            description = "A collection of mushrooms commonly found in forests.",
            imgUrl = "https://example.com/images/forest_mushrooms.jpg",
            isFavourite = false
        )
    )

    private val mockCards: List<Card> = listOf(
        // Cards para el Álbum 1: Edible Mushrooms
        Card(albumId = "1", mushroomName = "Edible Mushroom Card 1", imageUrl = "https://example.com/images/edible_mushrooms/card1.jpg"),
        Card(albumId = "1", mushroomName = "Edible Mushroom Card 2", imageUrl = "https://example.com/images/edible_mushrooms/card2.jpg"),
        Card(albumId = "1", mushroomName = "Edible Mushroom Card 3", imageUrl = "https://example.com/images/edible_mushrooms/card3.jpg"),
        Card(albumId = "1", mushroomName = "Edible Mushroom Card 4", imageUrl = "https://example.com/images/edible_mushrooms/card4.jpg"),
        Card(albumId = "1", mushroomName = "Edible Mushroom Card 5", imageUrl = "https://example.com/images/edible_mushrooms/card5.jpg"),

        // Cards para el Álbum 2: Poisonous Mushrooms
        Card(albumId = "2", mushroomName = "Poisonous Mushroom Card 1", imageUrl = "https://example.com/images/poisonous_mushrooms/card1.jpg"),
        Card(albumId = "2", mushroomName = "Poisonous Mushroom Card 2", imageUrl = "https://example.com/images/poisonous_mushrooms/card2.jpg"),
        Card(albumId = "2", mushroomName = "Poisonous Mushroom Card 3", imageUrl = "https://example.com/images/poisonous_mushrooms/card3.jpg"),
        Card(albumId = "2", mushroomName = "Poisonous Mushroom Card 4", imageUrl = "https://example.com/images/poisonous_mushrooms/card4.jpg"),
        Card(albumId = "2", mushroomName = "Poisonous Mushroom Card 5", imageUrl = "https://example.com/images/poisonous_mushrooms/card5.jpg"),

        // Cards para el Álbum 3: Medicinal Mushrooms
        Card(albumId = "3", mushroomName = "Medicinal Mushroom Card 1", imageUrl = "https://example.com/images/medicinal_mushrooms/card1.jpg"),
        Card(albumId = "3", mushroomName = "Medicinal Mushroom Card 2", imageUrl = "https://example.com/images/medicinal_mushrooms/card2.jpg"),
        Card(albumId = "3", mushroomName = "Medicinal Mushroom Card 3", imageUrl = "https://example.com/images/medicinal_mushrooms/card3.jpg"),
        Card(albumId = "3", mushroomName = "Medicinal Mushroom Card 4", imageUrl = "https://example.com/images/medicinal_mushrooms/card4.jpg"),
        Card(albumId = "3", mushroomName = "Medicinal Mushroom Card 5", imageUrl = "https://example.com/images/medicinal_mushrooms/card5.jpg"),

        // Cards para el Álbum 4: Mycorrhizal Mushrooms
        Card(albumId = "4", mushroomName = "Mycorrhizal Mushroom Card 1", imageUrl = "https://example.com/images/mycorrhizal_mushrooms/card1.jpg"),
        Card(albumId = "4", mushroomName = "Mycorrhizal Mushroom Card 2", imageUrl = "https://example.com/images/mycorrhizal_mushrooms/card2.jpg"),
        Card(albumId = "4", mushroomName = "Mycorrhizal Mushroom Card 3", imageUrl = "https://example.com/images/mycorrhizal_mushrooms/card3.jpg"),
        Card(albumId = "4", mushroomName = "Mycorrhizal Mushroom Card 4", imageUrl = "https://example.com/images/mycorrhizal_mushrooms/card4.jpg"),
        Card(albumId = "4", mushroomName = "Mycorrhizal Mushroom Card 5", imageUrl = "https://example.com/images/mycorrhizal_mushrooms/card5.jpg"),

        // Cards para el Álbum 5: Bioluminescent Mushrooms
        Card(albumId = "5", mushroomName = "Bioluminescent Mushroom Card 1", imageUrl = "https://example.com/images/bioluminescent_mushrooms/card1.jpg"),
        Card(albumId = "5", mushroomName = "Bioluminescent Mushroom Card 2", imageUrl = "https://example.com/images/bioluminescent_mushrooms/card2.jpg"),
        Card(albumId = "5", mushroomName = "Bioluminescent Mushroom Card 3", imageUrl = "https://example.com/images/bioluminescent_mushrooms/card3.jpg"),
        Card(albumId = "5", mushroomName = "Bioluminescent Mushroom Card 4", imageUrl = "https://example.com/images/bioluminescent_mushrooms/card4.jpg"),
        Card(albumId = "5", mushroomName = "Bioluminescent Mushroom Card 5", imageUrl = "https://example.com/images/bioluminescent_mushrooms/card5.jpg"),

        // Cards para el Álbum 6: Rare Mushrooms
        Card(albumId = "6", mushroomName = "Rare Mushroom Card 1", imageUrl = "https://example.com/images/rare_mushrooms/card1.jpg"),
        Card(albumId = "6", mushroomName = "Rare Mushroom Card 2", imageUrl = "https://example.com/images/rare_mushrooms/card2.jpg"),
        Card(albumId = "6", mushroomName = "Rare Mushroom Card 3", imageUrl = "https://example.com/images/rare_mushrooms/card3.jpg"),
        Card(albumId = "6", mushroomName = "Rare Mushroom Card 4", imageUrl = "https://example.com/images/rare_mushrooms/card4.jpg"),
        Card(albumId = "6", mushroomName = "Rare Mushroom Card 5", imageUrl = "https://example.com/images/rare_mushrooms/card5.jpg"),

        // Cards para el Álbum 7: Mushrooms in Art
        Card(albumId = "7", mushroomName = "Mushrooms in Art Card 1", imageUrl = "https://example.com/images/mushrooms_in_art/card1.jpg"),
        Card(albumId = "7", mushroomName = "Mushrooms in Art Card 2", imageUrl = "https://example.com/images/mushrooms_in_art/card2.jpg"),
        Card(albumId = "7", mushroomName = "Mushrooms in Art Card 3", imageUrl = "https://example.com/images/mushrooms_in_art/card3.jpg"),
        Card(albumId = "7", mushroomName = "Mushrooms in Art Card 4", imageUrl = "https://example.com/images/mushrooms_in_art/card4.jpg"),
        Card(albumId = "7", mushroomName = "Mushrooms in Art Card 5", imageUrl = "https://example.com/images/mushrooms_in_art/card5.jpg"),

        // Cards para el Álbum 8: Historical Uses of Mushrooms
        Card(albumId = "8", mushroomName = "Historical Mushroom Card 1", imageUrl = "https://example.com/images/historical_uses_of_mushrooms/card1.jpg"),
        Card(albumId = "8", mushroomName = "Historical Mushroom Card 2", imageUrl = "https://example.com/images/historical_uses_of_mushrooms/card2.jpg"),
        Card(albumId = "8", mushroomName = "Historical Mushroom Card 3", imageUrl = "https://example.com/images/historical_uses_of_mushrooms/card3.jpg"),
        Card(albumId = "8", mushroomName = "Historical Mushroom Card 4", imageUrl = "https://example.com/images/historical_uses_of_mushrooms/card4.jpg"),
        Card(albumId = "8", mushroomName = "Historical Mushroom Card 5", imageUrl = "https://example.com/images/historical_uses_of_mushrooms/card5.jpg"),

        // Cards para el Álbum 9: Psychedelic Mushrooms
        Card(albumId = "9", mushroomName = "Psychedelic Mushroom Card 1", imageUrl = "https://example.com/images/psychedelic_mushrooms/card1.jpg"),
        Card(albumId = "9", mushroomName = "Psychedelic Mushroom Card 2", imageUrl = "https://example.com/images/psychedelic_mushrooms/card2.jpg"),
        Card(albumId = "9", mushroomName = "Psychedelic Mushroom Card 3", imageUrl = "https://example.com/images/psychedelic_mushrooms/card3.jpg"),
        Card(albumId = "9", mushroomName = "Psychedelic Mushroom Card 4", imageUrl = "https://example.com/images/psychedelic_mushrooms/card4.jpg"),
        Card(albumId = "9", mushroomName = "Psychedelic Mushroom Card 5", imageUrl = "https://example.com/images/psychedelic_mushrooms/card5.jpg"),

        // Cards para el Álbum 10: Forest Mushrooms
        Card(albumId = "10", mushroomName = "Forest Mushroom Card 1", imageUrl = "https://example.com/images/forest_mushrooms/card1.jpg"),
        Card(albumId = "10", mushroomName = "Forest Mushroom Card 2", imageUrl = "https://example.com/images/forest_mushrooms/card2.jpg"),
        Card(albumId = "10", mushroomName = "Forest Mushroom Card 3", imageUrl = "https://example.com/images/forest_mushrooms/card3.jpg"),
        Card(albumId = "10", mushroomName = "Forest Mushroom Card 4", imageUrl = "https://example.com/images/forest_mushrooms/card4.jpg"),
        Card(albumId = "10", mushroomName = "Forest Mushroom Card 5", imageUrl = "https://example.com/images/forest_mushrooms/card5.jpg")
    )



    fun getAlbums(): List<Album> = mockAlbums

    fun getCardsByAlbum(albumId: String): List<Card> =
        mockCards.filter { it.albumId == albumId
        }



}