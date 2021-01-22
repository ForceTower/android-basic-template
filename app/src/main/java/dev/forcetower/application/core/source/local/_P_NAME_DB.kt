package dev.forcetower.application.core.source.local

import androidx.room.Database
import androidx.room.RoomDatabase
import dev.forcetower.application.core.model._M_NAME_
import dev.forcetower.application.core.source.local.dao._M_NAME_Dao

@Database(entities = [
    _M_NAME_::class
], version = 1)
abstract class _P_NAME_DB : RoomDatabase() {
    abstract val basic: _M_NAME_Dao
}