package com.ralph.second;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

import com.baidu.mapapi.SDKInitializer;

/**
 * Created by ${肖岩} on 2016/6/16.
 */
public class HaoShi extends Application {
    @Override
    public void onCreate() {
        SDKInitializer.initialize(getApplicationContext());
        super.onCreate();
    }
}
