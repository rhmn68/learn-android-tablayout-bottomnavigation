package com.rahmanaulia.latihantablayout.tablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rahmanaulia.latihantablayout.fragment.BirdsFragment
import com.rahmanaulia.latihantablayout.fragment.CatsFragment
import com.rahmanaulia.latihantablayout.fragment.DogsFragment
import com.rahmanaulia.latihantablayout.R
import com.rahmanaulia.latihantablayout.adapter.TabAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initTabLayout()
    }

    private fun initTabLayout() {
        val tabAdapter = TabAdapter(supportFragmentManager)
        tabAdapter.setData(BirdsFragment(), "Birds")
        tabAdapter.setData(CatsFragment(), "Cats")
        tabAdapter.setData(DogsFragment(), "Dogs")

        vpMain.adapter = tabAdapter
        tabLayout.setupWithViewPager(vpMain)
    }
}
