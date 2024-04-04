package com.thibault.game_list_ui.di

import com.thibault.game_list_ui.GameListViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val gameListUiProfile = module {
    viewModel{ GameListViewModel()}
}