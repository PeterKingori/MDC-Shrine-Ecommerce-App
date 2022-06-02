package com.google.codelabs.mdc.kotlin.shrine

import android.os.Bundle
import android.text.Editable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.codelabs.mdc.kotlin.shrine.databinding.ShrLoginFragmentBinding

/**
 * Fragment representing the login screen for Shrine.
 */
class LoginFragment : Fragment() {
    private lateinit var binding: ShrLoginFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        // Retrieve and inflate the layout for this fragment
        binding = ShrLoginFragmentBinding.inflate(inflater, container, false)

        binding.apply {
            // Set an error if password is less than 8 characters.
            nextButton.setOnClickListener {
                if (!isPasswordValid(passwordEditText.text!!)) {
                    passwordTextInput.error = getString(R.string.shr_error_password)
                } else {
                    // Clear the error.
                    passwordTextInput.error = null
                    // Navigate to the next Fragment.
                    (activity as NavigationHost).navigateTo(ProductGridFragment(), false)
                }
            }

            // Clear the error once more than 8 characters are typed.
            passwordEditText.setOnKeyListener { _, _, _ ->
                if (isPasswordValid(passwordEditText.text!!)) {
                    // Clear the error.
                    passwordTextInput.error = null
                }
                false
            }
        }

        return binding.root
    }

    /**
     * Determine whether or not a password is valid.
     */
    private fun isPasswordValid(text: Editable?): Boolean {
        return text != null && text.length >= 8
    }

}
