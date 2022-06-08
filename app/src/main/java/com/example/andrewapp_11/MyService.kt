package com.example.andrewapp_11

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyService : FirebaseMessagingService() {

    override fun onNewToken(token: String) {
        super.onNewToken(token)
        Log.i("FireBase", "onNewToken $token")
    }

    override fun onMessageReceived(message: RemoteMessage) {
        super.onMessageReceived(message)
        message.let {
            for(entry in it.data.entries){
                Log.i("Message", "${entry.key}/${entry.value}")
            }
        }
    }
}