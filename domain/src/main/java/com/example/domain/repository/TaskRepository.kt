package com.example.domain.repository

import com.example.domain.model.Task
import com.example.domain.model.TaskEntityModel
import kotlinx.coroutines.flow.Flow

interface TaskRepository {
    suspend fun insertTask(taskEntityModel: TaskEntityModel) : Long
    suspend fun getTaskById(taskId: Int): TaskEntityModel?
    suspend fun deleteTask(taskId: Long)
    suspend fun fetchTask() : Flow<List<TaskEntityModel>>
}