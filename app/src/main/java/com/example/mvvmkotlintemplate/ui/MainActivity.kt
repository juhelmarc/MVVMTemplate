package com.example.mvvmkotlintemplate.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mvvmkotlintemplate.databinding.ActivityMainBinding
import androidx.activity.viewModels
import androidx.fragment.app.commit
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import com.example.mvvmkotlintemplate.R
import com.example.mvvmkotlintemplate.ui.mainFragment.splashFragment.SplashFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    lateinit var navController: NavController
    lateinit var navHostFragment: NavHostFragment

//    private lateinit var navController : NavController
    private val viewModel by viewModels<MainActivityViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
//        navController = Navigation.findNavController(binding.root)
        navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        //This will make our navController accessable from any fragment where we have a reference to mainActivity
        navController = navHostFragment.navController
        if(savedInstanceState == null) {
            navController.navigate(R.id.action_mainFragment_to_splashFragment)
        }
        setContentView(binding.root)
//        navController.navigate(R.id.action_mainFragment_to_splashFragment)
//        runSplashFragment()
//        onBackPressedDispatcher()
    }

//    private fun runSplashFragment() {
//        supportFragmentManager.commit {
//            replace(R.id.nav_host_fragment, SplashFragment())
//        }
//    }
//    private fun onBackPressedDispatcher() {
//        onBackPressedDispatcher.addCallback(object : OnBackPressedCallback(true) {
//            override fun handleOnBackPressed() {
//                // handle logic
//
//            }
//        })
//    }


}