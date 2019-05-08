package com.example.instagram.ui.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.graphics.PorterDuff
import android.graphics.PorterDuffColorFilter
import com.example.instagram.ui.fragments.BaseAppCompatActivity
import com.example.instagram.ui.fragments.ExploreFragment
import com.example.instagram.ui.fragments.FeedFragment
import com.example.instagram.ui.fragments.ProfileFragment
import kotlinx.android.synthetic.main.toolbar_main.*
import portfolio.personal.instagramdesign.R


class MainActivity : BaseAppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragmentWindow, FeedFragment.getInstance(), "feed")
                .commit()
        }

        navHome.setOnClickListener {
//            setSupportActionBar()

            navProfile.drawable.colorFilter = PorterDuffColorFilter(resources.getColor(R.color.navBarGrey,null), PorterDuff.Mode.MULTIPLY)
            navExplore.drawable.colorFilter = PorterDuffColorFilter(resources.getColor(R.color.navBarGrey,null), PorterDuff.Mode.MULTIPLY)
            navUpload.drawable.colorFilter = PorterDuffColorFilter(resources.getColor(R.color.navBarGrey,null), PorterDuff.Mode.MULTIPLY)
            navHome.drawable.colorFilter = PorterDuffColorFilter(resources.getColor(android.R.color.black,null), PorterDuff.Mode.MULTIPLY)
            addFragmentToActivity(supportFragmentManager,FeedFragment.getInstance(),R.id.fragmentWindow) }

        navExplore.setOnClickListener {
            addFragmentToActivity(supportFragmentManager,ExploreFragment.getInstance(),R.id.fragmentWindow)
            navProfile.drawable.colorFilter = PorterDuffColorFilter(resources.getColor(R.color.navBarGrey,null), PorterDuff.Mode.MULTIPLY)
            navHome.drawable.colorFilter = PorterDuffColorFilter(resources.getColor(R.color.navBarGrey,null), PorterDuff.Mode.OVERLAY)
            navUpload.drawable.colorFilter = PorterDuffColorFilter(resources.getColor(R.color.navBarGrey,null), PorterDuff.Mode.MULTIPLY)
            navExplore.drawable.colorFilter = PorterDuffColorFilter(resources.getColor(android.R.color.black,null), PorterDuff.Mode.MULTIPLY)}

        navUpload.setOnClickListener {
            navHome.drawable.colorFilter = PorterDuffColorFilter(resources.getColor(R.color.navBarGrey,null), PorterDuff.Mode.OVERLAY)
            navProfile.drawable.colorFilter = PorterDuffColorFilter(resources.getColor(R.color.navBarGrey,null), PorterDuff.Mode.MULTIPLY)
            navExplore.drawable.colorFilter = PorterDuffColorFilter(resources.getColor(R.color.navBarGrey,null), PorterDuff.Mode.MULTIPLY)
            navUpload.drawable.colorFilter = PorterDuffColorFilter(resources.getColor(android.R.color.black,null), PorterDuff.Mode.MULTIPLY)
            addFragmentToActivity(supportFragmentManager,FeedFragment.getInstance(),R.id.fragmentWindow) }

        navProfile.setOnClickListener {
            navHome.drawable.colorFilter = PorterDuffColorFilter(resources.getColor(R.color.navBarGrey,null), PorterDuff.Mode.OVERLAY)
            navExplore.drawable.colorFilter = PorterDuffColorFilter(resources.getColor(R.color.navBarGrey,null), PorterDuff.Mode.MULTIPLY)
            navUpload.drawable.colorFilter = PorterDuffColorFilter(resources.getColor(R.color.navBarGrey,null), PorterDuff.Mode.MULTIPLY)
            navProfile.drawable.colorFilter = PorterDuffColorFilter(resources.getColor(android.R.color.black,null), PorterDuff.Mode.MULTIPLY)
            addFragmentToActivity(supportFragmentManager, ProfileFragment.getInstance(),R.id.fragmentWindow) }


    }

    fun addFragmentToActivity(manager: FragmentManager, fragment: Fragment, frameId: Int) {

        val transaction = manager.beginTransaction()
        transaction.add(frameId, fragment)
        transaction.commit()

    }
}
