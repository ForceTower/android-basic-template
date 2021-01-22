package dev.forcetower.application.view.basic

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import dev.forcetower.application.databinding.FragmentBasicBinding
import dev.forcetower.toolkit.components.BaseFragment

@AndroidEntryPoint
class BasicFragment : BaseFragment() {
    private val viewModel: BasicViewModel by viewModels()
    private lateinit var binding: FragmentBasicBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return FragmentBasicBinding.inflate(inflater, container, false).also {
            binding = it
        }.root
    }
}