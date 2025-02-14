package com.edu.expmdmfebrero.feature.presentation

import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.edu.expmdmfebrero.databinding.FragmentCardListBinding
import com.edu.expmdmfebrero.feature.presentation.adapter.CardAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

class CardListFragment : Fragment() {

    private var _binding: FragmentCardListBinding? = null
    private val binding get() = _binding!!

    private val viewModel: CardListViewModel by viewModel()
    private val cardAdapter: CardAdapter by lazy {
        CardAdapter()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCardListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpRecyclerView()
        setUpObservers()

        val albumId = arguments?.getString("albumId") ?: ""
        viewModel.loadCards(albumId)
    }

    private fun setUpRecyclerView() {
        binding.recyclerViewCards.apply {
            layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            adapter = cardAdapter
        }
    }

    private fun setUpObservers() {
        viewModel.uiState.observe(viewLifecycleOwner, Observer { state ->
            cardAdapter.submitList(state.cards)
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
