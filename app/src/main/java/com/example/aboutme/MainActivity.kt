package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainerView
import com.example.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bottomNavigation.setOnNavigationItemSelectedListener {
            handeBottonNavigation(it.itemId,binding)
        }
        binding.bottomNavigation.selectedItemId=R.id.menu_bio
    }

    fun handeBottonNavigation(menuItemId:Int,binding:ActivityMainBinding):Boolean {
        return when(menuItemId){
            R.id.menu_bio -> {
                swapFragments(BioFragment())
                true
            }
            R.id.menu_family -> {
                swapFragments(FamilyFragment())
                true
            }
            R.id.menu_hobbies ->{
                swapFragments(HobbiesFragment())
                true
            }
            else -> false
        }
    }

    private fun swapFragments(fragment:Fragment){
        supportFragmentManager.beginTransaction()
            .replace(R.id.container,fragment)
            .commit()
    }
}