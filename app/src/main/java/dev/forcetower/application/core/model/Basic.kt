package dev.forcetower.application.core.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Basic(
    @PrimaryKey
    val id: Int
)
