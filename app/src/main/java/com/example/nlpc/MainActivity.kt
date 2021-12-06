package com.example.nlpc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.Toolbar
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.findNavController()


        val bottomNavigation: BottomNavigationView = findViewById(R.id.bottomNav)
        val toolbar: Toolbar = findViewById(R.id.toolbar)

        toolbar.setupWithNavController(navController)
        bottomNavigation.setupWithNavController(navController)



        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.loginFragment -> {
                    bottomNavigation.visibility = View.GONE
                }
                R.id.registerFragment -> {
                    bottomNavigation.visibility = View.GONE
                }
                R.id.verifyOTPFragment -> {
                    bottomNavigation.visibility = View.GONE
                }

                else -> {
                    bottomNavigation.visibility = View.VISIBLE

                }
            }
        }
    }
}