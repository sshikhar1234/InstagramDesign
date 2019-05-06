package com.example.instagram.ui.fragments

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.example.instagram.ui.adapters.ProfileStoryAdapter
import kotlinx.android.synthetic.main.fragment_profile.*
import portfolio.personal.instagramdesign.R

class ProfileFragment : Fragment()
{
    companion object {
        fun getInstance(): ProfileFragment {
            return ProfileFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_profile,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val activity = activity as Context
        rviewProfileStory.adapter = ProfileStoryAdapter(activity)
        rviewProfileStory.layoutManager = LinearLayoutManager(activity, LinearLayout.HORIZONTAL,false)
        addFragmentToFragment(childFragmentManager,PListFragment.getInstance(),R.id.nestedFragmentWindow) }
}
    fun addFragmentToFragment(manager: FragmentManager, fragment: Fragment, frameId: Int) {

        val transaction = manager.beginTransaction()
        transaction.add(frameId, fragment)
        transaction.commit()

    }
