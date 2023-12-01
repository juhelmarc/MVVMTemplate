package com.example.mvvmkotlintemplate.ui.mainActivity.hostFragment.alphaFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.viewModels
import com.example.mvvmkotlintemplate.R
import com.example.mvvmkotlintemplate.databinding.ActivityMainBinding
import com.example.mvvmkotlintemplate.databinding.FragmentBinding
import com.example.mvvmkotlintemplate.ui.mainActivity.alphaActivity.MainActivityViewModel
import com.example.mvvmkotlintemplate.ui.mainActivity.hostFragment.fragmentB3.alfaFragmentB3.FragmentB3Fragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HostFragment : Fragment() {
    private lateinit var binding : FragmentBinding
    private val viewModel by viewModels<MainActivityViewModel>()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) : View {
        binding = FragmentBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.actualFragment.text = "HostFragment"
        binding.nextButton.setOnClickListener {
            parentFragmentManager.popBackStack() //not work cause we dont add addToBackStack() in parent transaction (MainActivity -> HostFragment)
            runFragmentB3()
        }
    }
    private fun runFragmentB3() {
        parentFragmentManager.commit {
            replace(R.id.main_container, FragmentB3Fragment())
            addToBackStack("BackToHostFragment")
            setReorderingAllowed(true)
        }
    }
}
