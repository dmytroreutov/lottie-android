package com.airbnb.lottie.issues

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.airbnb.lottie.issues.databinding.IssueReproActivityBinding

class IssueReproActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = IssueReproActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navController = findNavController(R.id.nav_host_fragment_main)

        with(binding) {
            bnvMain.setupWithNavController(navController)
            bnvMain.itemIconTintList = null
            bnvMain.itemRippleColor = null
            bnvMain.background = null
            bnvMain.elevation = 0f
        }
    }

    private fun FragmentActivity.findNavController(navHostId: Int): NavController {
        val navHostFragment = supportFragmentManager.findFragmentById(navHostId) as NavHostFragment
        return navHostFragment.navController
    }
}
