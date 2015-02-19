package com.example.parseskeletonnotification;


import android.app.Application;

import com.parse.Parse;
import com.parse.PushService;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(this, "APPLICATION ID", " KEY");
        PushService.setDefaultPushCallback(this, MainActivity.class);
    }
}
