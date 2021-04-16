package com.example.b30services

import android.app.IntentService
import android.content.Intent
import android.util.Log

open class MyIntentService : IntentService("my thread"){


    override fun onHandleIntent(intent: Intent?) {

        Log.i("mytag","Intentservice onHandle")

        for (i in 1..5){
            Thread.sleep(1000)
        }

    }

    override fun onCreate() {
        super.onCreate()
        Log.i("mytag","Intentservice created")

    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.i("mytag","Intentservice started")

        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("mytag","Intentservice destroyed")

    }
}