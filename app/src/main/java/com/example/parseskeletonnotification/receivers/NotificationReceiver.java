package com.example.parseskeletonnotification.receivers;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;


import com.example.parseskeletonnotification.R;

import org.json.JSONException;
import org.json.JSONObject;


public class NotificationReceiver extends BroadcastReceiver {
    String title;

    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle b = intent.getExtras();
        title ="Notification Test";
        String data = b.getString("com.parse.Data");
        try {
            JSONObject json = new JSONObject(data);
            NotificationCompat.Builder noti = new NotificationCompat.Builder(context);
            String message = json.getString("message");
            int pushId = json.getInt("id");

            noti.setDefaults(Notification.DEFAULT_VIBRATE);
            noti.setDefaults(Notification.DEFAULT_LIGHTS);

            noti.setContentTitle(title).setContentText(message)
                    .setSmallIcon(R.drawable.ic_launcher)
                    .setAutoCancel(true)
                    .setDefaults(Notification.DEFAULT_SOUND);

            NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
            notificationManager.notify(pushId,noti.build());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
