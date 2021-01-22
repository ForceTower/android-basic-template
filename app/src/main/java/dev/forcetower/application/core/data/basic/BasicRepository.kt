package dev.forcetower.application.core.data.basic

import dev.forcetower.application.core.source.local.BasicDB
import dev.forcetower.application.core.source.network.BasicService
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class BasicRepository @Inject constructor(
    private val database: BasicDB,
    private val service: BasicService
)