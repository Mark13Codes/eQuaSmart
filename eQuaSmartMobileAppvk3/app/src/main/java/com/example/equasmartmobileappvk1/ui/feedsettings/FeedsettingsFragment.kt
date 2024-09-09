package com.example.equasmartmobileappvk1.ui.feedsettings

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.example.equasmartmobileappvk1.R
import com.example.equasmartmobileappvk1.databinding.FragmentFeedsettingsBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class FeedsettingsFragment : Fragment(R.layout.fragment_feedsettings) {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: FragmentFeedsettingsBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Bind the layout for this Fragment
        binding = FragmentFeedsettingsBinding.bind(view)

        val bottomNavViewFeedsettings: BottomNavigationView = binding.feedsettingsBottomNavigationBar
        val navControllerFeedsettings = childFragmentManager.findFragmentById(R.id.bottom_nav_host_fragment_feedsettings)
            ?.findNavController()

        // Ensure the navController is not null
        navControllerFeedsettings?.let { navController ->
            // Define a set of top-level destinations
            appBarConfiguration = AppBarConfiguration(
                setOf(
                    R.id.nav_feedchartFragment,
                    R.id.nav_feedsettingSubMenuFragment,
                    R.id.nav_feedmenuFragment
                )
            )

            // Setup BottomNavigationView with NavController
            bottomNavViewFeedsettings.setupWithNavController(navController)
        }
    }
}
