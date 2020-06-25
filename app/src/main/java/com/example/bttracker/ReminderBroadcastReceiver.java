package com.example.bttracker;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

public class ReminderBroadcastReceiver extends BroadcastReceiver {


    private Object TAG;

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // Create an Intent with LogActivity as the destination
        Intent notificationIntent = new Intent(context, LogActivity.class);
        // Create an PendingIntent with the newly created Intent
        PendingIntent contentIntent = PendingIntent.getActivity(context, 0, notificationIntent, 0);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "BT_Tracker_Channel")
                .setSmallIcon(R.mipmap.ic_launcher_round)
                .setContentTitle("Notification from BT Tracker")
                .setContentText("Please log your body temperature now")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setContentIntent(contentIntent); // Append the PendingIntent when
        building notification;

        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(context);
        notificationManager.notify(200, builder.build()); // Fire notification
        Log.d((String) TAG, "finish building notification");
        notificationManager = NotificationManagerCompat.from(context);
        Log.d((String) TAG, "start firingnotification");
        builder = null;
        notificationManager.notify(200, builder.build());
        Log.d((String) TAG, "notification fired");
        // TODO: This method is called when the BroadcastReceiver is receiving
        // Create an Intent with LogActivity as the destination
        notificationIntent = new Intent(context, LogActivity.class);
        // an Intent broadcast.
        builder = new NotificationCompat.Builder(context, "BT_Tracker_Channel");
        builder.setSmallIcon(R.mipmap.ic_launcher_round);
        builder.setContentTitle("Notification from BT Tracker");
        builder.setContentText("Please log your body temperature now");
        builder.setPriority(NotificationCompat.PRIORITY_DEFAULT);
        notificationManager = NotificationManagerCompat.from(context);
        notificationManager.notify(200, builder.build());
        // ID could be any number

    }

    private class building {
    }

    private class TAG {
    }
}
