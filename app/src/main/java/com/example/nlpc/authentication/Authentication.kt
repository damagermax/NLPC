package com.example.nlpc.authentication

import android.util.Log
import com.google.firebase.auth.FirebaseAuth

class Authentication {
    private val auth: FirebaseAuth = FirebaseAuth.getInstance()


    fun createUserWithEmailAndPassword(email: String, password: String) {
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information

                } else {
                    // If sign in fails, display a message to the user.

                }
            }

    }



}