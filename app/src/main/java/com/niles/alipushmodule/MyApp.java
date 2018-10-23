package com.niles.alipushmodule;

import android.app.Application;

import com.niles.ali_push.AliPushManager;

/**
 * Created by Niles
 * Date 2018/10/23 17:08
 * Email niulinguo@163.com
 */
public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AliPushManager.init(this);
    }
}
