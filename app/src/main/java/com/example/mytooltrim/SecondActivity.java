package com.example.mytooltrim;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); // 动态隐藏标题栏 并且全屏
        setContentView(R.layout.activity_second);
    }
}
