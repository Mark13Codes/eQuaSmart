package com.example.equasmartmobileappvk1.ui.printlogs

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PrintlogsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Print Logs Fragment"
    }
    val text: LiveData<String> = _text
}