package com.example.equasmartmobileappvk1.ui.feedsettings.submenu_feedsettings

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.equasmartmobileappvk1.R

class FeedmenuFragment : Fragment() {

    companion object {
        fun newInstance() = FeedmenuFragment()
    }

    private val viewModel: FeedmenuViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_feedmenu, container, false)
    }
}