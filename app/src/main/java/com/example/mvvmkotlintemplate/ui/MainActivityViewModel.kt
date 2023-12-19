package com.example.mvvmkotlintemplate.ui

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor() : ViewModel(){

    private var data : String = "0"



    fun setNewData(string : String) {
        data = string
    }

    fun getData() : String {
        return data
    }
}