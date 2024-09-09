package com.example.equasmartmobileappvk1

import android.os.Bundle
import android.util.Log // Import Log for debugging
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.equasmartmobileappvk1.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("MainActivity", "onCreate: Starting MainActivity...")

        // Inflate the activity layout using view binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d("MainActivity", "onCreate: Set content view with binding.root")

        // Set up the Action Bar with NavController
        setSupportActionBar(binding.appBarMain.toolbar)
        Log.d("MainActivity", "onCreate: Set support action bar")

        // Initialize DrawerLayout and NavigationView
        val drawerLayout: DrawerLayout = binding.drawerLayoutmainactivity
        val navView: NavigationView = binding.navViewlayout

        Log.d("MainActivity", "onCreate: DrawerLayout and NavigationView initialized")

        try {
            // Attempt to find NavController
            val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment_content_main) as NavHostFragment
            val navController = navHostFragment.navController
            //val navController = findNavController(R.id.nav_host_fragment_content_main)
            Log.d("MainActivity", "onCreate: NavController found successfully")

            // Proceed to configure AppBar and Navigation
            appBarConfiguration = AppBarConfiguration(
                setOf(
                    R.id.nav_dashboard,
                    R.id.nav_addsystem,
                    R.id.nav_feedsettings,
                    R.id.nav_watersettings,
                    R.id.nav_notification,
                    R.id.nav_printlogs,
                    R.id.nav_qrscanner
                ), drawerLayout
            )

            Log.d("MainActivity", "onCreate: AppBarConfiguration set successfully")

            setupActionBarWithNavController(navController, appBarConfiguration)
            Log.d("MainActivity", "onCreate: ActionBar set up with NavController")

            navView.setupWithNavController(navController)
            Log.d("MainActivity", "onCreate: NavigationView set up with NavController")

        } catch (e: IllegalArgumentException) {
            Log.e("MainActivity", "onCreate: IllegalArgumentException while finding NavController", e)
        } catch (e: Exception) {
            Log.e("MainActivity", "onCreate: Unexpected error while finding NavController", e)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        Log.d("MainActivity", "onCreateOptionsMenu: Inflating menu")
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        Log.d("MainActivity", "onSupportNavigateUp: Handling Up button")
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment_content_main) as NavHostFragment
        val navController = navHostFragment.navController
        //val navController = findNavController(R.id.nav_host_fragment_content_main)
        val result = navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
        Log.d("MainActivity", "onSupportNavigateUp: navigateUp result: $result")
        return result
    }
}
