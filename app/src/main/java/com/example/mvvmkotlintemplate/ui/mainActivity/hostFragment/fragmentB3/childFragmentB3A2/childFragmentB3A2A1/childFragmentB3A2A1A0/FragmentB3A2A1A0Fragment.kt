package com.example.mvvmkotlintemplate.ui.mainActivity.hostFragment.fragmentB3.childFragmentB3A2.childFragmentB3A2A1.childFragmentB3A2A1A0

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.mvvmkotlintemplate.databinding.FragmentBinding
import com.example.mvvmkotlintemplate.ui.mainActivity.alphaActivity.MainActivityViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FragmentB3A2A1A0Fragment : Fragment() {
    private lateinit var binding: FragmentBinding
    private val viewModel by viewModels<MainActivityViewModel>()
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
        binding.parentFragment.text = "HF -> FragB3 -> Frag B3A2 -> FragB3A2A1"
        binding.actualFragment.text = "FragmentB3A2A1A0"
        binding.nextButton.setOnClickListener {
            parentFragmentManager.popBackStack()
        }
    }

}