package com.rahmanaulia.latihantablayout.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class TabAdapter(fm: FragmentManager)
    : FragmentStatePagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){

    private var listFragment = ArrayList<Fragment>()
    private var listTitleFragment = ArrayList<String>()

    fun setData(fragment: Fragment, title: String){
        listFragment.add(fragment)
        listTitleFragment.add(title)
    }

    override fun getItem(position: Int): Fragment = listFragment[position]

    override fun getCount(): Int = listFragment.size

    override fun getPageTitle(position: Int): CharSequence?
            = listTitleFragment[position]
}