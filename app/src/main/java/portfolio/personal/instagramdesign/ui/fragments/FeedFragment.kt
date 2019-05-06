package com.example.instagram.ui.fragments

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.instagram.ui.adapters.FeedAdapter
import kotlinx.android.synthetic.main.fragment_feed.*
import portfolio.personal.instagramdesign.R

class FeedFragment : Fragment()
{
    companion object {
        fun getInstance(): FeedFragment {
            return FeedFragment()
        }
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_feed,container,false)
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val activity = activity as Context
        rvfeed.adapter = FeedAdapter(activity)
        rvfeed.layoutManager = LinearLayoutManager(activity)
    }
}