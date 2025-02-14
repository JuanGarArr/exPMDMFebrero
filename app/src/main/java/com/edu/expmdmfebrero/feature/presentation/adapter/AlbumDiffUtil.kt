package com.edu.expmdmfebrero.feature.presentation.adapter

import androidx.recyclerview.widget.DiffUtil
import com.edu.expmdmfebrero.feature.domain.Album

class AlbumDiffUtil : DiffUtil.ItemCallback<Album>() {
    override fun areItemsTheSame(oldItem: Album, newItem: Album): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Album, newItem: Album): Boolean {
        return oldItem == newItem
    }

}