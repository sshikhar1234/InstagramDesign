package com.example.instagram.ui.fragments

import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity

open class BaseAppCompatActivity : AppCompatActivity()
{
    companion object {
        fun getInstance(): BaseAppCompatActivity {
            return BaseAppCompatActivity()
        }


    }

}