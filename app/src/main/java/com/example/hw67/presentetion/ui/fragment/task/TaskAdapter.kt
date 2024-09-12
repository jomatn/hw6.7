package com.example.hw67.presentetion.ui.fragment.task

import TaskEntityUI
import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.hw67.databinding.ItemTaskBinding

class TaskAdapter(private val onItemClick: (taskId: Int) -> Unit) :
    ListAdapter<TaskEntityUI, TaskAdapter.TaskListViewHolder>(TaskDiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskListViewHolder {
        return TaskListViewHolder(
            ItemTaskBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: TaskListViewHolder, position: Int) {
        holder.onBind(getItem(position))
    }

    inner class TaskListViewHolder(private val binding: ItemTaskBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(taskEntityUi: TaskEntityUI) {
            with(binding) {
                tvTaskName.text = taskEntityUi.taskName
                tvTaskDescription.text = taskEntityUi.description
                tvTaskTime.text = formatTime(taskEntityUi.time)
            }

            itemView.setOnClickListener {
                onItemClick(taskEntityUi.taskId.toInt())
            }
        }

        @SuppressLint("DefaultLocale")
        private fun formatTime(_timeInMillis: Long): String {
            val calendar = java.util.Calendar.getInstance().apply {
                timeInMillis = _timeInMillis
            }
            val hour = calendar.get(java.util.Calendar.HOUR_OF_DAY)
            val minute = calendar.get(java.util.Calendar.MINUTE)
            return String.format("%02d:%02d", hour, minute)
        }
    }

    companion object {
        class TaskDiffUtil : DiffUtil.ItemCallback<TaskEntityUI>() {
            override fun areItemsTheSame(oldItem: TaskEntityUI, newItem: TaskEntityUI): Boolean {
                return oldItem.taskId == newItem.taskId
            }

            override fun areContentsTheSame(oldItem: TaskEntityUI, newItem: TaskEntityUI): Boolean {
                return oldItem == newItem
            }
        }
    }
}