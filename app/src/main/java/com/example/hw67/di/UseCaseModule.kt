package com.example.hw67.di

import com.example.data.db.AppDatabase
import org.koin.core.module.Module
import org.koin.dsl.module
import androidx.room.Room
import com.example.domain.usecase.DeleteUseCase
import com.example.domain.usecase.GetUseCase
import com.example.domain.usecase.InsertUseCase
import org.koin.core.scope.get

val useCaseModule: Module = module {
    factory { InsertUseCase(get()) }
    factory { GetUseCase(get()) }
    factory { DeleteUseCase(get()) }
}