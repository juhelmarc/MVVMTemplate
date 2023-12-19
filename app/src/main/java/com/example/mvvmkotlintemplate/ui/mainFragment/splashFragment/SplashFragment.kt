package com.example.mvvmkotlintemplate.ui.mainFragment.splashFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.mvvmkotlintemplate.R
import com.example.mvvmkotlintemplate.databinding.FragmentBinding
import com.example.mvvmkotlintemplate.ui.MainActivityViewModel
import com.example.mvvmkotlintemplate.ui.mainFragment.MainFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SplashFragment : Fragment() {

    private lateinit var binding : FragmentBinding
    private val mainViewModel by activityViewModels<MainActivityViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.parentFragment.text = mainViewModel.getData()
        binding.actualFragment.text = "SplashFragment"
        binding.nextButton.text = "NEXT"
        binding.nextButton.setOnClickListener {
            findNavController().navigate(R.id.action_splashFragment_to_mainFragment)
        }
        mainViewModel.setNewData("Splash")
    }
}