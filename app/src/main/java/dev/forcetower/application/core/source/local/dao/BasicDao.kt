package dev.forcetower.application.core.source.local.dao

import androidx.room.Dao
import dev.forcetower.application.core.model.Basic
import dev.forcetower.toolkit.database.dao.BaseDao

@Dao
abstract class BasicDao : BaseDao<Basic>()