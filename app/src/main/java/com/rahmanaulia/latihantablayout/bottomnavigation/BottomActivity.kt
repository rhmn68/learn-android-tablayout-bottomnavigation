package com.rahmanaulia.latihantablayout.bottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.rahmanaulia.latihantablayout.fragment.BirdsFragment
import com.rahmanaulia.latihantablayout.fragment.CatsFragment
import com.rahmanaulia.latihantablayout.fragment.DogsFragment
import com.rahmanaulia.latihantablayout.R
import kotlinx.android.synthetic.main.activity_bottom.*

class BottomActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom)

        initBottomNavigation()
    }

    private fun initBottomNavigation() {
        bottomNavigation.setOnNavigationItemSelectedListener{
            when(it.itemId){
                R.id.action_home -> {
                    replaceFragment(BirdsFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.action_fav -> {
                    replaceFragment(CatsFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.action_profile -> {
                    replaceFragment(DogsFragment())
                    return@setOnNavigationItemSelectedListener true
                }
            }
            return@setOnNavigationItemSelectedListener false
        }

        bottomNavigation.selectedItemId = R.id.action_home
    }

    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frameContainer, fragment)
            .addToBackStack(null)
            .commit()
    }
}
