package com.edu.expmdmfebrero.feature.presentation.adapter

import androidx.recyclerview.widget.RecyclerView
import com.edu.expmdmfebrero.databinding.ItemCardBinding
import com.edu.expmdmfebrero.feature.domain.Card

class CardViewHolder(
private val binding: ItemCardBinding)
    : RecyclerView.ViewHolder(binding.root){

    fun bind(card: Card){
        binding.cardImage.setImageResource(android.R.drawable.ic_menu_gallery)
        binding.cardMushroomName.text = card.mushroomName

    }

}