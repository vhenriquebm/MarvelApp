package com.example.marvel.ui.detail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.marvel.databinding.FragmentDetailBinding
import com.example.marvel.databinding.FragmentFavoriteCharacterBinding
import com.example.marvel.ui.base.BaseFragment
import com.example.marvel.ui.favorite.FavoriteFragmentViewModel

class DetailFragmentFragment :
    BaseFragment<FragmentDetailBinding, DetailFragmentViewModel>() {
    override val viewModel: DetailFragmentViewModel by viewModels()

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentDetailBinding =
        FragmentDetailBinding.inflate(inflater, container, false)
}