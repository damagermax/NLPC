package com.example.nlpc.view

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController
import com.example.nlpc.R
import com.example.nlpc.utils.showToast
import com.google.firebase.auth.FirebaseAuth
import com.hbb20.CountryCodePicker


class LoginFragment : Fragment() {


    private lateinit var loginBtn: Button

    private lateinit var auth: FirebaseAuth
    private lateinit var emailInput: EditText
    private lateinit var passwordInput: EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        auth = FirebaseAuth.getInstance()

        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_login, container, false)
        loginBtn = view.findViewById(R.id.submitBtn)
        emailInput = view.findViewById(R.id.login_email_edit_text)
        passwordInput = view.findViewById(R.id.login_password_edit_text)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        loginBtn.setOnClickListener {


            when {
                TextUtils.isEmpty(emailInput.text) -> {
                    requireActivity().showToast("Enter your email")

                }
                TextUtils.isEmpty(passwordInput.text) -> {
                    requireActivity().showToast("Enter your password")

                }
                else -> {

                    signInUser()
                }
            }
        }
    }

    private fun signInUser() {
        val email=emailInput.text.toString()
        val password=passwordInput.text.toString()


        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                        // move to listen now screen
                    val action = LoginFragmentDirections.actionLoginFragmentToListenNowFragment()
                    findNavController().navigate(action)


                } else {
                    // If sign in fails, display a message to the user.
                    requireActivity().showToast(task.exception?.message.toString())

                }
            }

    }


}