package com.edu.expmdmfebrero.feature.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.edu.expmdmfebrero.databinding.ItemAlbumBinding
import com.edu.expmdmfebrero.feature.domain.Album

class AlbumAdapter(
    private val onClick: (Album) -> Unit,
    private val onFavoriteClick: (Album) -> Unit
) : ListAdapter<Album, AlbumViewHolder>(AlbumDiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumViewHolder {
        val binding = ItemAlbumBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AlbumViewHolder(binding, onClick, onFavoriteClick)
    }

    override fun onBindViewHolder(holder: AlbumViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}


