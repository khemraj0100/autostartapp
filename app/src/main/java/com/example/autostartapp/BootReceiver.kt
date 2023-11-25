package com.example.autostartapp

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast


class BootReceiver   : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
//        if (intent.action == Intent.ACTION_BOOT_COMPLETED) {
            val appLaunchIntent = Intent(context, MainActivity::class.java)
//            appLaunchIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(appLaunchIntent)
            Log.d("oooppeen","jsxdj")
            Toast.makeText(context,"open app ",Toast.LENGTH_LONG).show()
//        }

        if (intent.action.equals(Intent.ACTION_BOOT_COMPLETED)) {
            // Schedule the alarm to start the app
            val alarmManager = context.getSystemService(Context.ALARM_SERVICE) as AlarmManager
            val appIntent = Intent(
                context,
                MainActivity::class.java
            ) // Replace MainActivity with your app's main activity
            val pendingIntent =
                PendingIntent.getActivity(context, 0, appIntent, PendingIntent.FLAG_UPDATE_CURRENT)
            val triggerTime = System.currentTimeMillis() + 5000 // Delay of 5 seconds after boot
            alarmManager[AlarmManager.RTC_WAKEUP, triggerTime] = pendingIntent

            val appLaunchIntent = Intent(context, MainActivity::class.java)
            appLaunchIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(appLaunchIntent)
            Log.d("regthrthr","dfbgd")
            Toast.makeText(context,"dfghdg app ",Toast.LENGTH_LONG).show()
        }

    }

}