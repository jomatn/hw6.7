package com.example.data.di

import com.example.data.Repository.TaskRepositoryImpl
import com.example.domain.repository.TaskRepository
import org.koin.dsl.module

val repositoryModule = module {
    single<TaskRepository> { TaskRepositoryImpl(get()) }
}