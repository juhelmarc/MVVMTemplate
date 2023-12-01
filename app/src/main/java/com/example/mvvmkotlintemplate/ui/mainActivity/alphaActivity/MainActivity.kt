package com.example.mvvmkotlintemplate.ui.mainActivity.alphaActivity

import android.os.Bundle
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.activity.OnBackPressedDispatcher
import androidx.appcompat.app.AppCompatActivity
import com.example.mvvmkotlintemplate.databinding.ActivityMainBinding
import androidx.activity.viewModels
import androidx.fragment.app.commit
import com.example.mvvmkotlintemplate.R
import com.example.mvvmkotlintemplate.ui.mainActivity.hostFragment.alphaFragment.HostFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private val viewModel by viewModels<MainActivityViewModel>()
    var isBackStackTransaction = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        runHostFragment()
        onBackPressedDispatcher()
    }

    private fun runHostFragment() {
        supportFragmentManager.commit {
            add(R.id.main_container, HostFragment())
        }
    }
    private fun onBackPressedDispatcher() {
        onBackPressedDispatcher.addCallback(object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                // handle logic

            }
        })
    }


}