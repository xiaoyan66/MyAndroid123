package com.ralph.second;

import android.app.TabActivity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by ${肖岩} on 2016/6/1.
 */
public class Ex29Activity extends TabActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex29_layout);
        TabHost host = getTabHost();

        TabHost.TabSpec tab1 = host.newTabSpec("tab1").setIndicator("我的主页").setContent(R.id.tab1);
        host.addTab(tab1);

        TabHost.TabSpec tab2 = host.newTabSpec("tab2").setIndicator("我的图案").setContent(R.id.tab2);
        host.addTab(tab2);
    }
}
