package com.example.marvel.ui.favorite

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.marvel.databinding.FragmentFavoriteCharacterBinding
import com.example.marvel.databinding.FragmentSearchCharacterBinding
import com.example.marvel.ui.base.BaseFragment
import com.example.marvel.ui.search.SearchCharacterViewModel

class FavoriteCharacterFragment :
    BaseFragment<FragmentFavoriteCharacterBinding, FavoriteFragmentViewModel>() {
    override val viewModel: FavoriteFragmentViewModel by viewModels()

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentFavoriteCharacterBinding =
        FragmentFavoriteCharacterBinding.inflate(inflater, container, false)
}