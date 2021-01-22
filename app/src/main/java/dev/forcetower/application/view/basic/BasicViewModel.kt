package dev.forcetower.application.view.basic

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import dev.forcetower.application.core.data.basic.BasicRepository

class BasicViewModel @ViewModelInject constructor(
    private val repository: BasicRepository
) : ViewModel()