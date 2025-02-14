package com.edu.expmdmfebrero.feature.presentation.adapter

import androidx.recyclerview.widget.DiffUtil
import com.edu.expmdmfebrero.feature.domain.Card

class CardDiffUtil : DiffUtil.ItemCallback<Card>() {
    override fun areItemsTheSame(oldItem: Card, newItem: Card): Boolean {
        return oldItem.albumId == newItem.albumId
    }

    override fun areContentsTheSame(oldItem: Card, newItem: Card): Boolean {
        return oldItem == newItem
    }

}