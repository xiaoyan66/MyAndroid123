package com.ralph.second;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/5/27.
 */
public class Ex27Activity extends Activity {
    int x=300;
    int y=200;
    List<zidan> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        list=new ArrayList<zidan>();
        super.onCreate(savedInstanceState);
        Ex27view v=new Ex27view(this);
        v.setOnTouchListener(v);
        setContentView(v);
    }



}
