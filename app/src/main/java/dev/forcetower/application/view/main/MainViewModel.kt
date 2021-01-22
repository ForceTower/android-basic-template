package dev.forcetower.application.view.main

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import dev.forcetower.application.core.data.basic._M_NAME_Repository

class MainViewModel @ViewModelInject constructor(
    private val repository: _M_NAME_Repository
) : ViewModel()