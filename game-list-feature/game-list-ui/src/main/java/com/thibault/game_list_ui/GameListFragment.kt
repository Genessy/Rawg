package com.thibault.game_list_ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.thibault.game_list_ui.databinding.FragmentGameListBinding
import org.koin.androidx.viewmodel.ext.android.viewModel


class GameListFragment : Fragment() {
    private lateinit var binding: FragmentGameListBinding
    private val viewModel by viewModel<GameListViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentGameListBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.testText.text = viewModel.getGameList()
    }

    companion object {

        fun newInstance() =
            GameListFragment()
    }
}