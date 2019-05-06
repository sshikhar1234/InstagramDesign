package com.example.instagram.ui.fragments

import android.os.Bundle
import android.support.v4.app.Fragment

open class BaseFragment : Fragment()
{
    lateinit var mActivity: BaseAppCompatActivity
    companion object {
        fun getInstance(): BaseFragment {
            return BaseFragment()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mActivity = activity as BaseAppCompatActivity
    }


}