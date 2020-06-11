package com.example.bttracker;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

public class ReminderBroadcastReceiver extends BroadcastReceiver {



    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "BT_Tracker_Channel");
        builder.setSmallIcon(R.mipmap.ic_launcher_round);
        builder.setContentTitle("Notification from BT Tracker");
        builder.setContentText("Please log your body temperature now");
        builder.setPriority(NotificationCompat.PRIORITY_DEFAULT);
        NotificationManagerCompat notificationManager =NotificationManagerCompat.from(context);
        notificationManager.notify(200, builder.build());
        // ID could be any number

    }
}
