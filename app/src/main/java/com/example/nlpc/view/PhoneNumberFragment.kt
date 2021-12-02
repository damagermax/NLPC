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
import com.hbb20.CountryCodePicker


class PhoneNumberFragment : Fragment() {



    private lateinit var submitBtn: Button
    private lateinit var countryCodePicker: CountryCodePicker
    private lateinit var phoneNumberInput: EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        val view=inflater.inflate(R.layout.fragment_phone_number, container, false)
        submitBtn = view.findViewById(R.id.submitBtn)
        countryCodePicker = view.findViewById(R.id.ccp)
        phoneNumberInput = view.findViewById(R.id.numberEt)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        submitBtn.setOnClickListener {
            countryCodePicker.registerCarrierNumberEditText(phoneNumberInput)
            val fullNumber = countryCodePicker.fullNumberWithPlus

            when {
                TextUtils.isEmpty(phoneNumberInput.text) -> {
                    requireActivity().showToast("Enter phone number")

                }
                phoneNumberInput.text.length < 10  -> {
                    requireActivity().showToast("Phone number should contain 10 digits")

                }
                else -> {

                    val action =PhoneNumberFragmentDirections.actionPhoneNumberFragmentToVerifyOTPFragment()
                    findNavController().navigate(action)

                }
            }
        }
    }


}