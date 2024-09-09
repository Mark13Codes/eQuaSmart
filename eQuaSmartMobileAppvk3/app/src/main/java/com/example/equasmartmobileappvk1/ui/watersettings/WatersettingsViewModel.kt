package com.example.equasmartmobileappvk1.ui.watersettings

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class WatersettingsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Water Settings Fragment"
    }
    val text: LiveData<String> = _text
}