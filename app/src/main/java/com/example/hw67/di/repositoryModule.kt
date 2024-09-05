package com.example.hw67.di

import com.example.data.db.AppDatabase
import org.koin.core.module.Module
import org.koin.dsl.module
import androidx.room.Room
import com.example.data.Repository.Repository
import com.example.domain.repository.TaskRepository

val repositoryModule: Module = module {
    single<TaskRepository> {
        Repository(get())
    }
}