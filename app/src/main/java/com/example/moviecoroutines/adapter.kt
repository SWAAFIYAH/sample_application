package com.example.moviecoroutines

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.moviecoroutines.UI.Details.DetailsFragment
import com.example.moviecoroutines.UI.Details.movieFragment

class adapter(fragmentManager: FragmentManager):

    FragmentStatePagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {


    private val fragments = listOf(
        movieFragment(),
        DetailsFragment(),


    )
    override fun getCount(): Int = fragments.size

    override fun getItem(position: Int): Fragment = fragments[position]

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "movie"
            1 -> "Details"
            // Add more titles as needed
            else -> "movie"
        }
    }
}