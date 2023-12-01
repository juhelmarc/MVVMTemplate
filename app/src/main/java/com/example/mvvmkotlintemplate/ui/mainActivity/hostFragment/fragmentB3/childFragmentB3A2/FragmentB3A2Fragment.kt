package com.example.mvvmkotlintemplate.ui.mainActivity.hostFragment.fragmentB3.childFragmentB3A2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.viewModels
import com.example.mvvmkotlintemplate.R
import com.example.mvvmkotlintemplate.databinding.FragmentBinding
import com.example.mvvmkotlintemplate.ui.mainActivity.alphaActivity.MainActivityViewModel
import com.example.mvvmkotlintemplate.ui.mainActivity.hostFragment.fragmentB3.alfaFragmentB3.FragmentB3Fragment
import com.example.mvvmkotlintemplate.ui.mainActivity.hostFragment.fragmentB3.childFragmentB3A2.childFragmentB3A2A1.FragmentB3A2A1Fragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FragmentB3A2Fragment : Fragment() {
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
        binding.parentFragment.text = "HFFB3"
        binding.actualFragment.text = "FragmentB3A2"
        binding.nextButton.setOnClickListener {
            runFragmentB3A2A1()
        }
    }

    private fun runFragmentB3A2A1() {
        parentFragmentManager.commit {
            replace(R.id.main_container, FragmentB3A2A1Fragment())
            addToBackStack("BackToFragmentB3A2")
            setReorderingAllowed(true)
        }
    }
}