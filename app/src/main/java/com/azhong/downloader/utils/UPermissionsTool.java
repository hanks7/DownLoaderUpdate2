package com.azhong.downloader.utils;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 侯建军
 * @data on 2018/1/3 17:09
 * @org www.hopshine.com
 * @function 请填写
 * @email 474664736@qq.com
 *
 *
 *   UPermissionsTool.
getIntance(this).
addPermission(Manifest.permission.READ_EXTERNAL_STORAGE).
addPermission(Manifest.permission.READ_EXTERNAL_STORAGE).
addPermission(Manifest.permission.READ_EXTERNAL_STORAGE).
addPermission(Manifest.permission.READ_EXTERNAL_STORAGE).
initPermission();
 */
public class UPermissionsTool {
    public static Builder getIntance(Activity activity) {
        return new Builder(activity);
    }

    public static class Builder {

        private Activity mActivity;
        private List<String> permissionList;

        public Builder(@NonNull Activity activity) {
            mActivity = activity;
            permissionList = new ArrayList<>();
        }

        /**
         * Determine whether <em>you</em> have been granted a particular permission.
         *
         * @param permission The name of the permission being checked.
         * @return {@link PackageManager#PERMISSION_GRANTED} if you have the
         * permission, or {@link PackageManager#PERMISSION_DENIED} if not.
         * @see PackageManager#checkPermission(String, String)
         */
        public Builder addPermission(@NonNull String permission) {
            if (!permissionList.contains(permission)) {
                permissionList.add(permission);
            }
            return this;
        }

        public List<String> initPermission() {
            List<String> list = new ArrayList<>();
            for (String permission : permissionList) {
                if (ActivityCompat.checkSelfPermission(mActivity, permission) != PackageManager.PERMISSION_GRANTED) {
                    list.add(permission);
                }
            }
            if (list.size() > 0) {
                ActivityCompat.requestPermissions(mActivity, list.toArray(new String[list.size()]), 1);
            }
            return list;
        }

    }

}
