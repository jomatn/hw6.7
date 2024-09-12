package com.example.hw67.presentetion.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.model.Task
import com.example.domain.model.TaskEntityModel
import com.example.domain.usecase.DeleteUseCase
import com.example.domain.usecase.GetUseCase
import com.example.domain.usecase.InsertUseCase
import kotlinx.coroutines.launch

class TaskViewModel(
    private val insertTaskUseCase: InsertUseCase,
    private val getTaskUseCase: GetUseCase,
    private val deleteTaskUseCase: DeleteUseCase
) : ViewModel() {

    fun insertTask(task: TaskEntityModel) {
        viewModelScope.launch {
            insertTaskUseCase.invoke(task)
        }
    }

    fun getTaskById(taskId: Int) {
        viewModelScope.launch {
            getTaskUseCase.invoke(taskId)
        }
    }

    fun deleteTask(taskId: Int) {
        viewModelScope.launch {
            deleteTaskUseCase.execute(taskId)
        }
    }
}