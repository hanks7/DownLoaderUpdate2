package com.azhong.downloader.utils;

/**
 * @author 侯建军
 * @data on 2018/1/4 15:00
 * @org www.hopshine.com
 * @function 请填写
 * @email 474664736@qq.com
 */

public class Utools {

    public static String getLastContent(String content) {
        return content.substring(content.lastIndexOf("/") + 1);
    }
}
