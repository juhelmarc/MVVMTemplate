package com.example.mvvmkotlintemplate.ui.mainFragment.fragmentB3.childFragmentB3A2.childFragmentB3A2A1.childFragmentB3A2A1A0

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.mvvmkotlintemplate.R
import com.example.mvvmkotlintemplate.databinding.FragmentBinding
import com.example.mvvmkotlintemplate.ui.MainActivityViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FragmentB3A2A1A0Fragment : Fragment() {
    private lateinit var binding: FragmentBinding
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
        binding.actualFragment.text = "FragmentB3A2A2A0"
        binding.nextButton.text = "Back"
        binding.nextButton.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentB3A2A1A0Fragment_to_fragmentB3A2A1Fragment)
        }
        mainViewModel.setNewData("FragmentB3A2A1A0")
    }

}