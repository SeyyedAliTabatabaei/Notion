package com.notion.presentation.groupDetails

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.notion.presentation.challengeGroup.ChallengeGroupFragment
import com.notion.presentation.memberGroup.MemberGroupFragment

class GroupDetailsViewPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        val fragment = when(position){
            0 -> ChallengeGroupFragment()
            1 -> MemberGroupFragment()
            else -> MemberGroupFragment()
        }
        return fragment
    }
}