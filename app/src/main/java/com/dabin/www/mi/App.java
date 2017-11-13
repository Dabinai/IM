package com.dabin.www.mi;

import android.app.Application;

import io.rong.imkit.RongIM;

/**
 * Created by Dabin on 2017/10/30.
 */

public class App extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        RongIM.init(this);
    }
}
