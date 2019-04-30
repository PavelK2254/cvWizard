package com.pk.cvwizard.UI

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pk.cvwizard.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViewPager()
    }

    private fun initViewPager() {
        val mainViewPagerAdapter = HomePagerAdapter(supportFragmentManager)
        dots.setupWithViewPager(main_pager,true)
        main_pager.adapter =  mainViewPagerAdapter
    }
}
