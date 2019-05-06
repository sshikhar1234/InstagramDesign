package com.example.instagram.ui.fragments

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.example.instagram.ui.adapters.PListAdapter
import com.example.instagram.ui.adapters.ProfileStoryAdapter
import kotlinx.android.synthetic.main.fragment_p_list.*
import kotlinx.android.synthetic.main.fragment_profile.*
import portfolio.personal.instagramdesign.R

class PListFragment : Fragment()
{
    companion object {
        fun getInstance(): PListFragment {
            return PListFragment()
        }
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_p_list,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val activity = activity as Context
        rviewPlistView.adapter = PListAdapter(activity)
        rviewPlistView.layoutManager = GridLayoutManager(activity,3)
    }
}