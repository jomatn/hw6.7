package com.example.domain.di

import com.example.domain.usecase.DeleteUseCase
import com.example.domain.usecase.FetchUseCase
import com.example.domain.usecase.GetUseCase
import com.example.domain.usecase.InsertUseCase
import org.koin.dsl.module

val usesCaseModule = module {
    factory { DeleteUseCase(get()) }
    factory { InsertUseCase(get()) }
    factory { FetchUseCase(get()) }
    factory { GetUseCase(get()) }
}