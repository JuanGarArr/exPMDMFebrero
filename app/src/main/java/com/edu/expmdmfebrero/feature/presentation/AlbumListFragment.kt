package com.edu.expmdmfebrero.feature.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.edu.expmdmfebrero.R
import com.edu.expmdmfebrero.core.state.ViewState
import com.edu.expmdmfebrero.databinding.FragmentAlbumListBinding
import com.edu.expmdmfebrero.feature.domain.Album
import com.edu.expmdmfebrero.feature.presentation.adapter.AlbumAdapter

import org.koin.androidx.viewmodel.ext.android.viewModel

class AlbumListFragment : Fragment() {

    private var _binding: FragmentAlbumListBinding? = null
    private val binding get() = _binding!!
    private val viewModel: AlbumListViewModel by viewModel()

    private val albumListAdapter: AlbumAdapter by lazy {
        AlbumAdapter(onClick = { album -> navigateToDetail(album) },
            onFavoriteClick = { updatedAlbum -> viewModel.updateFavorite(updatedAlbum) })
    }

    private var favoritesFilter = false
    private var fullAlbumList: List<Album> = emptyList()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAlbumListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recyclerView.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.recyclerView.adapter = albumListAdapter
        binding.toolbar.setOnMenuItemClickListener { item ->
            when (item.itemId) {
                R.id.action_bookmark -> {
                    favoritesFilter = !favoritesFilter
                    updateMenuIcon(item)
                    updateAlbumList()
                    true
                }

                else -> false
            }
        }

        binding.stateView.setState(ViewState.LOADING)
        viewModel.uiState.observe(viewLifecycleOwner, Observer { uiState ->
            fullAlbumList = uiState.albums
            if (uiState.isLoading) {
                binding.stateView.setState(ViewState.LOADING)
            } else {
                if (uiState.albums.isNotEmpty()) {
                    binding.stateView.setState(ViewState.DATA)
                } else {
                    binding.stateView.setState(ViewState.ERROR)
                }
            }
            updateAlbumList()
        })
        viewModel.loadAlbums()
    }


    private fun updateAlbumList() {
        val listToShow =
            if (favoritesFilter) fullAlbumList.filter { it.isFavourite } else fullAlbumList
        albumListAdapter.submitList(listToShow)
    }

    private fun navigateToDetail(album: Album) {
        val action = AlbumListFragmentDirections.actionAlbumListToAlbumDetail(album.id)
        findNavController().navigate(action)
    }

    private fun updateMenuIcon(item: MenuItem) {
        if (favoritesFilter) {
            item.setIcon(R.drawable.baseline_bookmark_24)
        } else {
            item.setIcon(R.drawable.baseline_bookmark_border_24)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}



