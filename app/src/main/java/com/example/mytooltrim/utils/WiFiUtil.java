package com.example.mytooltrim.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by shkstart on 2017/4/4.
 */

public class WiFiUtil {
    /**
     * 判断是否连接WIFI
     * @param context  上下文
     * @return  boolean
     */
    public static boolean isWifiConnected(Context context) {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) context.getSystemService(
                Context.CONNECTIVITY_SERVICE);
        NetworkInfo wifiNetworkInfo = connectivityManager.getNetworkInfo(
                ConnectivityManager.TYPE_WIFI);
        if (wifiNetworkInfo.isConnected()) {
            return true;
        }
        return false;
    }
//     权限
//    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
//    <uses-permission android:name="android.permission.CHANGE_WIFI_STATE" />
//    <uses-permission android:name="android.permission.ACCESS_WIFI_STATE" />
//    <uses-permission android:name="android.permission.CHANGE_WIFI_MULTICAST_STATE" />
//    <uses-permission android:name="android.permission.INTERNET" />


}