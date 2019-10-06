package com.gemini.postapp.model.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.gemini.postapp.model.Post
import com.gemini.postapp.model.PostDao

@Database(entities = arrayOf(Post::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun postDao(): PostDao
}