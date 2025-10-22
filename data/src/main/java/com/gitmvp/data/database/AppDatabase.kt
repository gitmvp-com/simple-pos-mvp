package com.gitmvp.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.gitmvp.data.database.dao.ProductDao
import com.gitmvp.data.database.entity.ProductEntity

@Database(
    entities = [ProductEntity::class],
    version = 1,
    exportSchema = true
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun productDao(): ProductDao
}
