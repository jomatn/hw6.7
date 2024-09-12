package com.example.domain.usecase

import com.example.domain.model.Task
import com.example.domain.model.TaskEntityModel
import com.example.domain.repository.TaskRepository

class InsertUseCase(private val taskRepository: TaskRepository) {
    suspend operator fun invoke(task: TaskEntityModel) {
        taskRepository.insertTask(task)
    }
}