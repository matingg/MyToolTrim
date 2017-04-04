package com.example.mytooltrim.utils;

import android.content.Context;
import android.content.Intent;

/**
 * Created by shkstart on 2017/4/3.
 */

public class Utilsshare {

    //       分享
    static public void share(Context context) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, "分享");
        intent.putExtra(Intent.EXTRA_TEXT, "来自 的分享:" + "http://neihanshequ.com/");
        context.startActivity(Intent.createChooser(intent, "http://neihanshequ.com/"));
    }

}
