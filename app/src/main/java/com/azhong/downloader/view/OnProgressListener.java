package com.azhong.downloader.view;

/*
 * 项目名:    DownLoaderManger
 * 包名       com.azhong.downloader.view
 * 文件名:    OnProgressListener
 * 创建者:    ZSY
 * 创建时间:  2017/2/14 on 17:20
 * 描述:     TODO 进度更新
 */
public interface OnProgressListener {

    void updateProgress(int max, int progress);
}
