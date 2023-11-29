package com.example.mvvmkotlintemplate.ui.mainActivity.alphaActivity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mvvmkotlintemplate.databinding.ActivityMainBinding
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private val viewModel by viewModels<MainActivityViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}