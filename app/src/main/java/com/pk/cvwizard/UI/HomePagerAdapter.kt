package com.pk.cvwizard.UI

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.pk.cvwizard.UI.homepage.HomePageFragment

class HomePagerAdapter(supportFragmentManager: FragmentManager): FragmentPagerAdapter(supportFragmentManager) {

    override fun getItem(position: Int): Fragment {
        return HomePageFragment.newInstance()
    }

    override fun getCount(): Int {
         return 4
    }
}