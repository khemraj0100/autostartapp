package com.example.autostartapp

import android.app.assist.AssistContent
import android.app.assist.AssistStructure
import android.content.Intent
import android.os.Bundle
import android.service.voice.VoiceInteractionService
import android.service.voice.VoiceInteractionSession

class YourAssistantService : VoiceInteractionService() {
    fun onGetSupportVoiceInteractions(): Boolean {
        return true
    }

    override fun onLaunchVoiceAssistFromKeyguard() {
        val intent = Intent(Intent.ACTION_VOICE_COMMAND)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(intent)
    }

    fun onCreateVoiceInteractionSession(pendingIntent: Intent): VoiceInteractionSession {
        return YourAssistantSession(this)
    }
}

class YourAssistantSession(service: YourAssistantService) : VoiceInteractionSession(service) {
    override fun onHandleAssist(args: Bundle?, assistStructure: AssistStructure?, assistContent: AssistContent?) {
        // Handle the assist request
    }
}