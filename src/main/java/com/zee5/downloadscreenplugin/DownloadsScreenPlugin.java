package com.zee5.downloadscreenplugin;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;


import com.applicaster.plugin_manager.screen.PluginScreen;
import com.zee5.zee5dw.zee5downloader.DownloadActivity;
import com.zee5.zee5dw.zee5downloader.fragment.DownloadFragment;

import java.io.Serializable;
import java.util.HashMap;

public class DownloadsScreenPlugin implements PluginScreen {
    @Override
    public void present(Context context, HashMap<String, Object> screenMap, Serializable dataSource, boolean isActivity) {
        if(context != null)
        context.startActivity(new Intent(context, DownloadActivity.class));
    }

    @Override
    public Fragment generateFragment(HashMap<String, Object> screenMap, Serializable dataSource) {
        return (Fragment)DownloadFragment.newInstance();
    }
}
