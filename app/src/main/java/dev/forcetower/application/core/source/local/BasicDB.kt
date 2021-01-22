package dev.forcetower.application.core.source.local

import androidx.room.Database
import androidx.room.RoomDatabase
import dev.forcetower.application.core.model.Basic
import dev.forcetower.application.core.source.local.dao.BasicDao

@Database(entities = [
    Basic::class
], version = 1)
abstract class BasicDB : RoomDatabase() {
    abstract val basic: BasicDao
}