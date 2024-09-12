package com.example.domain.model

data class TaskEntityModel(
    val taskId: Long = -1,
    val taskName: String = String(),
    val description: String = String(),
    val time: Long
)