package com.edu.expmdmfebrero.feature.presentation.adapter

import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.edu.expmdmfebrero.R
import com.edu.expmdmfebrero.databinding.ItemAlbumBinding
import com.edu.expmdmfebrero.feature.domain.Album

class AlbumViewHolder(
    private val binding: ItemAlbumBinding,
    private val onClick: (Album) -> Unit,
    private val onFavoriteClick: (Album) -> Unit
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(album: Album) {
        binding.albumName.text = album.name
        binding.albumCreationDate.text = album.creationDate
        binding.albumDescription.text = album.description
        binding.albumImage.setImageResource(android.R.drawable.ic_menu_gallery)

        val bookmarkIcon = if (album.isFavourite) {
            R.drawable.baseline_bookmark_24
        } else {
            R.drawable.baseline_bookmark_border_24
        }
        binding.actionBookmark.setImageResource(bookmarkIcon)

        binding.root.setOnClickListener {
            onClick(album)
        }

        binding.actionBookmark.setOnClickListener {
            val newFavouriteState = !album.isFavourite
            val newIcon = if (newFavouriteState) R.drawable.baseline_bookmark_24 else R.drawable.baseline_bookmark_border_24
            binding.actionBookmark.setImageResource(newIcon)
            val message = if (newFavouriteState) "Se ha añadido a favoritos" else "Se ha quitado de favoritos"
            Toast.makeText(binding.root.context, message, Toast.LENGTH_SHORT).show()
            onFavoriteClick(album.copy(isFavourite = newFavouriteState))
        }
    }
}


