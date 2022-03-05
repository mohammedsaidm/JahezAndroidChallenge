package com.arheb.user.application

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build
import com.arheb.user.koin.*
import com.arheb.user.utilities.ConfigurationFile.Constants.CHANNEL_1_ID
import com.arheb.user.utilities.ConfigurationFile.Constants.CHANNEL_2_ID
import com.arheb.user.utilities.ConnectionReceiver
import com.arheb.user.utilities.ConnectionReceiver.connectionReceiverListener
import org.koin.android.ext.android.startKoin


class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        instance = this
        startKoin(this, listOf(DependencyModule,
                NetworkModule, ViewModelModule, CustomModules, SharedPreferenceModule))
        createNotificationChannels()
    }

    companion object {
        lateinit var instance: MyApplication
            private set
    }

    fun setConnectionListener(listener: ConnectionReceiver.ConnectionReceiverListener) {
        connectionReceiverListener = listener
    }

    //https://codinginflow.com/tutorials/android/notifications-notification-channels/part-1-notification-channels
    private fun createNotificationChannels() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel1 = NotificationChannel(
                    CHANNEL_1_ID,
                    "Channel 1",
                    NotificationManager.IMPORTANCE_HIGH
            )
            channel1.description = "This is Channel 1"
            val channel2 = NotificationChannel(
                    CHANNEL_2_ID,
                    "Channel 2",
                    NotificationManager.IMPORTANCE_LOW
            )
            channel2.description = "This is Channel 2"
            val manager = getSystemService(NotificationManager::class.java)
            manager.createNotificationChannel(channel1)
            manager.createNotificationChannel(channel2)
        }
    }

}