package com.example.mvvmkotlintemplate.ui.mainFragment.fragmentA0

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mvvmkotlintemplate.databinding.FragmentBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FragmentA0Fragment : Fragment(){
    private lateinit var binding : FragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBinding.inflate(layoutInflater, container, false)

        return binding.root
    }
}