package com.edu.expmdmfebrero.feature.domain

data class Album(
    val id: String,
    val name: String,
    val creationDate: String,
    val description: String,
    val imgUrl: String,
    val isFavourite: Boolean
)