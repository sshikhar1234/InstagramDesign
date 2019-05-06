package com.example.instagram.ui.fragments

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.instagram.ui.adapters.ExploreAdapter
import com.example.instagram.ui.adapters.FeedAdapter
import kotlinx.android.synthetic.main.fragment_explore.*
import kotlinx.android.synthetic.main.fragment_feed.*
import portfolio.personal.instagramdesign.R

class ExploreFragment : Fragment()
{
    companion object {
        fun getInstance(): ExploreFragment {
            return ExploreFragment()
        }
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_explore,container,false)
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val activity = activity as Context
        rvexplore.adapter = ExploreAdapter(activity)
        rvexplore.layoutManager = GridLayoutManager(activity,3)
    }
}