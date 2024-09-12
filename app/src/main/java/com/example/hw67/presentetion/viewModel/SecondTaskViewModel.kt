package com.example.imran_mamirov_hw_7_6.ui.fragment.taskDetail

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import androidx.lifecycle.viewModelScope
import com.example.domain.model.TaskEntityModel
import com.example.domain.usecase.GetUseCase
import kotlinx.coroutines.Dispatchers

class SecondTaskViewModel(
    private val getTaskUseCase: GetUseCase
) : ViewModel() {

    fun getTaskById(taskId: Int): LiveData<TaskEntityModel?> = liveData(viewModelScope.coroutineContext + Dispatchers.IO) {
        emit(getTaskUseCase(taskId))
    }
}