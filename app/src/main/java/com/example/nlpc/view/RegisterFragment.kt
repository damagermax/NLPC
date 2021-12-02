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


class RegisterFragment : Fragment() {



    private lateinit var userFullName: EditText
    private lateinit var userEmail: EditText
    private lateinit var registerBtn: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view=inflater.inflate(R.layout.fragment_register, container, false)
        userEmail = view.findViewById(R.id.userEmailInput)
        userFullName = view.findViewById(R.id.userFullNameInput)
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
            TextUtils.isEmpty(userEmail.text) -> {
                requireActivity().showToast("Enter your email")
            }
            TextUtils.isEmpty(userFullName.text) -> {
                requireActivity().showToast("Enter your full name")
            }
            else -> {
                saveUserInformation()

                val action =RegisterFragmentDirections.actionRegisterFragmentToListenNowFragment()
                findNavController().navigate(action)

            }
        }
    }

    private fun saveUserInformation() {
        val email = userEmail.text.toString()
        val fullName = userFullName.text.toString()



    }


}