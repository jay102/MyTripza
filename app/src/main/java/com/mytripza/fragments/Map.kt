package com.mytripza.fragments

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.mytripza.R

class Map : Fragment() {

    private lateinit var fragmentActivity : FragmentActivity

    override fun onCreateView(inflater : LayoutInflater, container : ViewGroup?,
                              savedInstanceState : Bundle?) : View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_map, container, false)
    }

    override fun onAttach(context : Context) {
        super.onAttach(context)
        fragmentActivity = activity as FragmentActivity
    }
}
