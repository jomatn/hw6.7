package com.example.data.db

import androidx.room.Dao
import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.data.model.TaskEntity

@Database(entities = [TaskEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun taskDao(): Dao
}