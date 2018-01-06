package com.azhong.downloader.base;

import android.app.Application;

/**
 * @author 侯建军
 * @data on 2018/1/4 11:04
 * @org www.hopshine.com
 * @function 请填写
 * @email 474664736@qq.com
 */

public class BaseApplication extends Application {
    public static BaseApplication application;

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
    }

    public static BaseApplication getIntance() {
        return application;
    }
}
