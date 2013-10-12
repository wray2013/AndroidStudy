package com.example;

import android.app.Application;

public class TestApplication extends Application {
    private static TestApplication instance;

    public static TestApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        // TODO Auto-generated method stub
        super.onCreate();
        instance = this;
    }
}
