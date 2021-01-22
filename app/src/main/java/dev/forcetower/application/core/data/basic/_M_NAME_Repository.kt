package dev.forcetower.application.core.data.basic

import dev.forcetower.application.core.source.local._P_NAME_DB
import dev.forcetower.application.core.source.network._P_NAME_Service
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class _M_NAME_Repository @Inject constructor(
    private val database: _P_NAME_DB,
    private val service: _P_NAME_Service
)