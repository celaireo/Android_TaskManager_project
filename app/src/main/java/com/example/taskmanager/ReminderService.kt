package com.example.taskmanager

class ReminderService : Service() {
    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        // Logique d'envoi de rappel
        val taskName = intent?.getStringExtra("task_name")
        taskName?.let {
            Toast.makeText(this, "Rappel: $taskName", Toast.LENGTH_LONG).show()
        }
        return START_STICKY
    }
}