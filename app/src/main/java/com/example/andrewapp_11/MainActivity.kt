package com.example.andrewapp_11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.messaging.FirebaseMessaging

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        FirebaseMessaging.getInstance().token.addOnCompleteListener {
            if(!it.isSuccessful)
                Log.e("Status", "Not Success")
            if(it.result == null)
                return@addOnCompleteListener
            val token = it.result
            Log.i("MainActivity", "Token $token")
        }
    }
}