package com.google.codelabs.mdc.kotlin.shrine

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

/**
 * Fragment representing the login screen for Shrine.
 */
class LoginFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.shr_login_fragment, container, false)

        // Snippet from "Navigate to the next Fragment" section goes here.

        return view
    }

    // "isPasswordValid" from "Navigate to the next Fragment" section method goes here
}
