package com.example.domain.usecase

import com.example.domain.repository.TaskRepository

class DeleteUseCase(private val taskRepository: TaskRepository) {
    suspend fun execute(taskId: Int) {
        taskRepository.deleteTask(taskId)
    }
}