package com.example.nlpc.view

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.example.nlpc.R
import com.example.nlpc.utils.showToast
import com.google.firebase.auth.FirebaseAuth


class RegisterFragment : Fragment() {


    private lateinit var passwordInput: EditText
    private lateinit var emailInput: EditText
    private lateinit var registerBtn: Button
    private lateinit var auth: FirebaseAuth


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Initialize Firebase Auth
        auth = FirebaseAuth.getInstance()

        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_register, container, false)
        emailInput = view.findViewById(R.id.registerEmailInput)
        passwordInput = view.findViewById(R.id.registerPasswordInput)
        registerBtn = view.findViewById(R.id.registerBtn)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        registerBtn.setOnClickListener {
            validateFields()
        }
    }

    private fun validateFields() {
        when {
            TextUtils.isEmpty(emailInput.text) -> {
                requireActivity().showToast("Enter your email")
            }
            TextUtils.isEmpty(passwordInput.text) -> {
                requireActivity().showToast("Enter your password")
            }
            else -> {
                registerUser()


            }
        }
    }

    private fun registerUser() {
        val email = emailInput.text.toString()
        val password = passwordInput.text.toString()


        createUserWithEmailAndPassword(email, password)

    }


    private fun createUserWithEmailAndPassword(email: String, password: String) {
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    requireActivity().showToast("registerd")

                } else {
                    // If sign in fails, display a message to the user.
                    requireActivity().showToast(task.exception?.message.toString())




                }
            }

    }


}