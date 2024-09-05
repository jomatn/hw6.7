package com.example.hw67.di

import com.example.hw67.presentetion.viewModel.TaskViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module


val viewModelModule: Module = module {
    viewModel { TaskViewModel(get(), get(), get()) }
}