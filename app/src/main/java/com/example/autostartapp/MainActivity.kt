package com.example.autostartapp

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    // Your activity initialization code
        // Register the BroadcastReceiver
        val receiver = BootReceiver()
        val filter = IntentFilter(Intent.ACTION_BOOT_COMPLETED)
        registerReceiver(receiver, filter)
    }

//    override fun onResume() {
//        super.onResume()
//        val filter = IntentFilter(Intent.ACTION_BOOT_COMPLETED)
//        registerReceiver(BootReceiver(), filter)
//        Toast.makeText(this,"onResume", Toast.LENGTH_SHORT).show()
//
//    }
//
//    override fun onPause() {
//        super.onPause()
//        unregisterReceiver(BootReceiver())
//        Toast.makeText(this,"onPause",Toast.LENGTH_SHORT).show()
//
//    }
}