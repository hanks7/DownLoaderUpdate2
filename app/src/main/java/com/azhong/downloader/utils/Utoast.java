package com.azhong.downloader.utils;

import android.widget.Toast;

import com.azhong.downloader.base.BaseApplication;


/**
 * @author 侯建军
 * @data on 2018/1/4 11:03
 * @org www.hopshine.com
 * @function 请填写
 * @email 474664736@qq.com
 */

public class Utoast {
    // 构造方法私有化 不允许new对象
    private Utoast() {
    }

    // Toast对象
    private static Toast toast = null;

    /**
     * 显示Toast
     */
    public static void s(Object strToast) {
        Ulog.e("Toast    "+strToast);
        if (toast == null) {
            toast = Toast.makeText(BaseApplication.getIntance(), "", Toast.LENGTH_SHORT);
        }
        toast.setText(strToast+"");
        toast.show();
    }
}
