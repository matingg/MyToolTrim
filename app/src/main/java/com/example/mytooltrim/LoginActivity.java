package com.example.mytooltrim;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mytooltrim.utils.MiscUtils;
import com.example.mytooltrim.utils.TransitionTime;
import com.example.mytooltrim.utils.Utilsshare;
import com.example.mytooltrim.utils.VirtualkeyboardHeight;
import com.example.mytooltrim.utils.WiFiUtil;
import com.example.mytooltrim.view.MyProgress;
import com.wyt.searchbox.SearchFragment;
import com.wyt.searchbox.custom.IOnSearchClickListener;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    @InjectView(R.id.progressbar)
    MyProgress progressbar;
    @InjectView(R.id.tv_progress)
    TextView tvProgress;
    private TransitionTime transitionTime;


    //   getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);  //  动态隐藏顶部状态栏
    //   requestWindowFeature(Window.FEATURE_NO_TITLE);    // 动态去掉窗口标题  setContentView(R.layout.activity_login);之前
    //    http://blog.csdn.net/bingjianIT/article/details/51706518 动态去掉窗口标题无效 解决办法  可以看出我的Activity是继承自AppCompatActivity，所以requestWindowFeature(Window.FEATURE_NO_TITLE);这句失效了
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);
        ButterKnife.inject(this);
        progressbar.setMax(100);  // 设置进度条的最大值
    }


    @OnClick(R.id.button_a)//  -----------------分享
    public void onButtonAClicked() {
        Utilsshare.share(this);
    }


    @OnClick(R.id.button_b) // ------------------搜索
    public void onButtonBClicked() {
//        compile 'com.wenwenwen888:searchbox:1.0.0'  // 带记录搜索   添加
//        compile 'com.android.support:design:25.2.0' // 可不用
        sousuo();
    }


    @OnClick(R.id.button_c) // -----------------获取版本号
    public void onButtonCClicked() {
        String str = getVersions();
        Toast.makeText(this, "版本号 : " + str, Toast.LENGTH_SHORT).show();
    }


    @OnClick(R.id.button_d)  //  圆形进度条
    public void onButtonDClicked() {
//        网址 ： http://blog.csdn.net/xiaanming/article/details/10298163
        progressbar.setTextSize(15);
        Toast.makeText(this, "圆形进度条", Toast.LENGTH_SHORT).show();
        progressbar.setProgress(progressbar.getProgress() + 50);
        tvProgress.setText(progressbar.getProgress() * 100 / progressbar.getMax() + "%");
    }


    @OnClick(R.id.button_e)
    public void onButtonEClicked() {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
        //  渐变跳转页面动画
        Toast.makeText(this, "渐变跳转页面动画", Toast.LENGTH_SHORT).show();
        overridePendingTransition(R.anim.main_alpha_press, R.anim.main_alpha);
//        finish();
    }

    @OnClick(R.id.button_f)
    public void onButtonFClicked() {

        if (WiFiUtil.isWifiConnected(this)) {
            Toast.makeText(this, "Wifi 需添加权限", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "手机网络 需添加权限", Toast.LENGTH_SHORT).show();
        }

    }

    @OnClick(R.id.button_g)  //  查询是什么时候发布的 刚刚 昨天 今天 一个星期
    public void onButtonGClicked() {
        transitionTime = new TransitionTime(System.currentTimeMillis());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Toast.makeText(this, "transitionTime==" + transitionTime.twoDateDistance(System.currentTimeMillis() + ""), Toast.LENGTH_SHORT).show();
    }


    @OnClick(R.id.button_h)   //  设备信息获取
    public void onButtonHClicked() {

        Toast.makeText(this, "国家： " + MiscUtils.getLanguage() +
                        "   语言：" + MiscUtils.getCountry() +
                        "   网络：" + MiscUtils.getAPN(this) +
                        "   品牌：" + MiscUtils.getManufacturer(this) +
                        "   sdk:" + MiscUtils.getSDKVer() +
                        "   型号：" + MiscUtils.getModel(this),
                Toast.LENGTH_SHORT).show();


    }

    @OnClick(R.id.button_i)   //  获取手机屏幕高度 等
    public void onButtonIClicked() {
        Toast.makeText(this, " 获取屏幕和底部的高度:" + VirtualkeyboardHeight.getDpi(this) +
                                "   获取底部虚拟键盘的高度:" + VirtualkeyboardHeight.getBottomStatusHeight(this) +
                                "   获取屏幕的高度:" + VirtualkeyboardHeight.getScreenHeight(this), Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.button_j)
    public void onButtonJClicked() {
    }

    @OnClick(R.id.button_k)
    public void onButtonKClicked() {
    }

    @OnClick(R.id.button_l)
    public void onButtonLClicked() {
    }

    @OnClick(R.id.button_m)
    public void onButtonMClicked() {
    }

    @OnClick(R.id.button_n)
    public void onButtonNClicked() {
    }

    @OnClick(R.id.button_o)
    public void onButtonOClicked() {
    }

    @OnClick(R.id.button_p)
    public void onButtonPClicked() {
    }

    @OnClick(R.id.button_q)
    public void onButtonQClicked() {
    }

    @OnClick(R.id.button_r)
    public void onButtonRClicked() {
    }

    @OnClick(R.id.button_s)
    public void onButtonSClicked() {
    }

    @OnClick(R.id.button_t)
    public void onButtonTClicked() {
    }

    @OnClick(R.id.button_u)
    public void onButtonUClicked() {
    }

    @OnClick(R.id.button_v)
    public void onButtonVClicked() {
    }

    @OnClick(R.id.button_w)
    public void onButtonWClicked() {
    }

    @OnClick(R.id.button_x)
    public void onButtonXClicked() {
    }

    @OnClick(R.id.button_y)
    public void onButtonYClicked() {
    }

    @OnClick(R.id.button_z)
    public void onButtonZClicked() {
    }

    @OnClick(R.id.button1)
    public void onButton1Clicked() {
    }

    @OnClick(R.id.button2)
    public void onButton2Clicked() {
    }

    @OnClick(R.id.button3)
    public void onButton3Clicked() {
    }

    @OnClick(R.id.button4)
    public void onButton4Clicked() {
    }

    @OnClick(R.id.button5)
    public void onButton5Clicked() {
    }

    @OnClick(R.id.button6)
    public void onButton6Clicked() {
    }

    @OnClick(R.id.button7)
    public void onButton7Clicked() {
    }

    @OnClick(R.id.button8)
    public void onButton8Clicked() {
    }

    @OnClick(R.id.button9)
    public void onButton9Clicked() {
    }


    private void sousuo() {   // 搜索 完成内容

//        compile 'com.wenwenwen888:searchbox:1.0.0'
//        compile 'com.android.support:design:25.2.0' // 可不用
        SearchFragment searchFragment = SearchFragment.newInstance();
        searchFragment.setOnSearchClickListener(new IOnSearchClickListener() {
            @Override
            public void OnSearchClick(String keyword) {
                //这里处理逻辑
                Toast.makeText(LoginActivity.this, keyword, Toast.LENGTH_SHORT).show();
            }
        });
        searchFragment.show(getSupportFragmentManager(), SearchFragment.TAG);

    }

    public String getVersions() {   // 获取版本号
        String versionName = null;
        try {
            //拿到包的管理器
            PackageManager packageManager = getPackageManager();
            //拿到包的管理信息
            PackageInfo packageArchiveInfo = packageManager.getPackageInfo(getPackageName(), 0);
            //得到版本 ,每次提交需要增加1
            int versionCode = packageArchiveInfo.versionCode;
            //得到版本号
            versionName = packageArchiveInfo.versionName;
            return versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return "";
    }


    @InjectView(R.id.button_a)
    Button buttonA;
    @InjectView(R.id.button_b)
    Button buttonB;
    @InjectView(R.id.button_c)
    Button buttonC;
    @InjectView(R.id.button_d)
    Button buttonD;
    @InjectView(R.id.button_e)
    Button buttonE;
    @InjectView(R.id.button_f)
    Button buttonF;
    @InjectView(R.id.button_g)
    Button buttonG;
    @InjectView(R.id.button_h)
    Button buttonH;
    @InjectView(R.id.button_i)
    Button buttonI;
    @InjectView(R.id.button_j)
    Button buttonJ;
    @InjectView(R.id.button_k)
    Button buttonK;
    @InjectView(R.id.button_l)
    Button buttonL;
    @InjectView(R.id.button_m)
    Button buttonM;
    @InjectView(R.id.button_n)
    Button buttonN;
    @InjectView(R.id.button_o)
    Button buttonO;
    @InjectView(R.id.button_p)
    Button buttonP;
    @InjectView(R.id.button_q)
    Button buttonQ;
    @InjectView(R.id.button_r)
    Button buttonR;
    @InjectView(R.id.button_s)
    Button buttonS;
    @InjectView(R.id.button_t)
    Button buttonT;
    @InjectView(R.id.button_u)
    Button buttonU;
    @InjectView(R.id.button_v)
    Button buttonV;
    @InjectView(R.id.button_w)
    Button buttonW;
    @InjectView(R.id.button_x)
    Button buttonX;
    @InjectView(R.id.button_y)
    Button buttonY;
    @InjectView(R.id.button_z)
    Button buttonZ;
    @InjectView(R.id.button1)
    Button button1;
    @InjectView(R.id.button2)
    Button button2;
    @InjectView(R.id.button3)
    Button button3;
    @InjectView(R.id.button4)
    Button button4;
    @InjectView(R.id.button5)
    Button button5;
    @InjectView(R.id.button6)
    Button button6;
    @InjectView(R.id.button7)
    Button button7;
    @InjectView(R.id.button8)
    Button button8;
    @InjectView(R.id.button9)
    Button button9;
    @InjectView(R.id.activity_main)
    LinearLayout activityMain;

}
