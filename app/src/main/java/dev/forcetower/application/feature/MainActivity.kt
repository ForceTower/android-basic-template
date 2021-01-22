package dev.forcetower.application.feature

import android.os.Bundle
import androidx.core.view.WindowCompat
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.AndroidEntryPoint
import dev.forcetower.application.R
import dev.forcetower.application.databinding.ActivityMainBinding
import dev.forcetower.toolkit.components.BaseActivity

@AndroidEntryPoint
class MainActivity : BaseActivity() {
    private lateinit var binding: ActivityMainBinding
    private val navController
        get() = findNavController(R.id.fragment_container)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        WindowCompat.setDecorFitsSystemWindows(window, false)
    }

    override fun showSnack(string: String, duration: Int) {
        getSnackInstance(string, duration)?.show()
    }

    override fun getSnackInstance(string: String, duration: Int): Snackbar? {
        return Snackbar.make(binding.root, string, duration)
    }

    override fun onSupportNavigateUp() = navController.navigateUp()
}