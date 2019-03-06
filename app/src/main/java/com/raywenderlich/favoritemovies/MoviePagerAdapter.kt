package com.raywenderlich.favoritemovies

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter

class MoviePagerAdapter(fm: FragmentManager, private val moviesList: ArrayList<Movie>) : FragmentStatePagerAdapter(fm) {


    override fun getItem(position: Int): Fragment = MovieFragment.newInstance(moviesList[position])

    override fun getCount(): Int = moviesList.size

    override fun getPageTitle(position: Int): CharSequence = moviesList[position].title
}