package com.example.equasmartmobileappvk1.ui.addsystem

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AddsystemViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Add System Fragment"
    }
    val text: LiveData<String> = _text
}