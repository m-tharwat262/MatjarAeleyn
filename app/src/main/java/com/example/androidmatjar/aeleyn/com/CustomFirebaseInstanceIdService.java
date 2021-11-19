package com.example.androidmatjar.aeleyn.com;

import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class CustomFirebaseInstanceIdService extends FirebaseMessagingService {


    private static final String LOG_TAG = CustomFirebaseInstanceIdService.class.getSimpleName();


    @Override
    public void onMessageReceived(@NonNull RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);

        getFirebaseMessage(remoteMessage.getNotification().getTitle(), remoteMessage.getNotification().getBody());

////        Toast.makeText(this, "tttttttttttttttttt", Toast.LENGTH_SHORT).show();
//        Log.i(LOG_TAG, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuh");
//
//        Intent intent = new Intent(this, MainActivity.class);
//        startActivity(intent);
    }


    public void getFirebaseMessage(String title, String message) {

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "myFirebaseChannel")
                .setSmallIcon(R.drawable.app_icon)
                .setContentTitle(title)
                .setContentText(message)
                .setAutoCancel(true);

        NotificationManagerCompat managerCompat = NotificationManagerCompat.from(this);
        managerCompat.notify(101, builder.build());

    }

}
