package com.example.nlpc.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.navigation.fragment.findNavController
import com.chaos.view.PinView
import com.example.nlpc.R
import com.example.nlpc.utils.showToast


class VerifyOTPFragment : Fragment() {

    private lateinit var pinView: PinView
    private lateinit var dialog: AlertDialog
    private lateinit var confirmBtn: Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =inflater.inflate(R.layout.fragment_verify_o_t_p, container, false)
        confirmBtn = view.findViewById(R.id.confirmBtn)
        pinView = view.findViewById(R.id.pinView)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        confirmBtn.setOnClickListener {

            val otp = pinView.text.toString()

            if (otp.isEmpty()) {
                requireActivity().showToast("Enter code")
            } else {
                val action =VerifyOTPFragmentDirections.actionVerifyOTPFragmentToRegisterFragment()
                findNavController().navigate(action)
            }


        }
    }


}