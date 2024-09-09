package com.example.equasmartmobileappvk1.ui.printlogs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.equasmartmobileappvk1.databinding.FragmentPrintlogsBinding

class PrintlogsFragment : Fragment() {

    private var _binding: FragmentPrintlogsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val printlogsViewModel =
            ViewModelProvider(this).get(PrintlogsViewModel::class.java)

        _binding = FragmentPrintlogsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textPrintlogs
        printlogsViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}