package com.nocturnal.myapplication

import android.os.Bundle
import com.nocturnal.myapplication.R
import androidx.appcompat.app.AppCompatActivity

import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager: ViewPager2 = findViewById(R.id.viewPager)
        val fragmentAdapter = FragmentAdapter(this)
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        viewPager.adapter = fragmentAdapter

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = when (position) {
                0 -> "Présentation"
                1 -> "Liste"
                else -> "Présentation Image"
            }
        }.attach()
    }
}