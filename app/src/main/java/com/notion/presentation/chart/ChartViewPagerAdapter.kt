package com.notion.presentation.chart

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class ChartViewPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        val fragment = when(position){
            0 -> GroupFragment()
            1 -> ChallengeFragment()
            2 -> SavingFragment()
            else -> GroupFragment()
        }
        return fragment
    }
}