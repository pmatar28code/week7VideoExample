package com.example.aboutme

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.aboutme.databinding.FragmentBioBinding

class BioFragment: Fragment(R.layout.fragment_bio) {
    // Wanted to save this code for legacy apps, lets understand it, its important
    //that's why i leaved my comment for my github
    /* override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return FragmentBioBinding.inflate(inflater,container,false).root
    }
    */
}