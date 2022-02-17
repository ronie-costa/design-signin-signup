package com.example.design_signin_signup.services.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class CredentialsFragmentAdapter(
    fm: FragmentManager,
    lifecycle: Lifecycle,
    private val listFragments: MutableList<Fragment>
) : FragmentStateAdapter(fm, lifecycle) {

    override fun getItemCount(): Int {
        return listFragments.count()
    }

    override fun createFragment(position: Int): Fragment {
        return listFragments[position]
    }

}