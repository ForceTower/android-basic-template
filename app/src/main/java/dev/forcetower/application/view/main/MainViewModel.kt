package dev.forcetower.application.view.main

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import dev.forcetower.application.core.data.basic.BasicRepository

class MainViewModel @ViewModelInject constructor(
    private val repository: BasicRepository
) : ViewModel()