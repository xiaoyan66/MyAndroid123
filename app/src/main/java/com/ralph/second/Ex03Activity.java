package com.ralph.second;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by 果占先 on 2016/5/13.
 */
public class Ex03Activity extends BaseActivity {
    TextView tv1;
    TextView tv2;
    TextView tv4;
    @Override
    protected void initmycreate(Bundle savedInstanceState) {
        setContentView(R.layout.ex03_layout);
        tv1= (TextView) findViewById(R.id.kuandu);
        tv2= (TextView) findViewById(R.id.gaodu);
        tv4= (TextView) findViewById(R.id.dpi);
    }

    public  void  huoqu(View v){
        DisplayMetrics h=new DisplayMetrics();
        h=getResources().getDisplayMetrics();
        int w=h.widthPixels;
        int gao=h.heightPixels;
        float d=h.density;
        int dp=h.densityDpi;
        tv1.setText("宽是"+w+"寸");
        tv2.setText("高是"+gao+"寸");
        tv4.setText("手机dp是"+dp+"");
    }
}
