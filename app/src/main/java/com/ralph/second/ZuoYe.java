package com.ralph.second;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by xiaoyan on 2016/5/29.
 */
public class ZuoYe extends BaseActivity {
    ListView lv;
    String[] zuoye = {"1.hello world！", "2.放一个图片", "3.获取手机分辨率 ", "4.点击图片轮循", "5.画心", "6.完成布局", "7.霓虹灯闪烁",
            "8.完成布局", "9.完成计算器布局界面", "10.飞机拖动", "11.点击图片，连到通讯录的一个电话号码", "12.完成布局", "13.短信验证码", "14.弹球游戏",
            "15.百度API手机归属地查询", "16.利用百度API做一个菜谱查询（带图片的）", "17.下拉列表", "18.国际化图片", "19.背景音乐设置", "20.图片下载", "21.控制透明度",
            "22.图片上传","23.完成自动搜索功能","24.平板电脑和手机适配","25.Dialog弹出框的练习", "26.星级评分条", "27.飞机大战 ","28.设置闹钟",
            "29.选项卡","30.图形旋转","31.播放动画","32.SurfaceView画图", "33.横,竖屏的时候显示不同的布局","34.读SD卡","35.百度语音合成",
            "36.打电话,发信息,回主页,去百度","37.手势", "38.来电提醒", "39.群发短信 ","40.播放视频","41.录音及播放","42.Retrofit请求","43.指南针" ,"44.百度地图","45.GPS获取位置信息"};
    Class[] clazz = {Ex01Activity.class, Ex02Activity.class, Ex03Activity.class, Ex04Activity.class, Ex05Activity.class, Ex06Activity.class, Ex07Activity.class,
            Ex08Activity.class, Ex09Activity.class, Ex10Activity.class, Ex11Activity.class, Ex12Activity.class, Ex13Activity.class, EX14Activity.class,
            Ex15Activity.class, Ex16Activity.class, Ex17Activity.class, Ex18Activity.class, Ex19Activity.class, Ex20Activity.class, Ex21Activity.class,
            Ex22Activity.class, Ex23Activity.class, Ex24Activity.class, Ex25Activity.class, Ex26Activity.class, Ex27Activity.class, Ex28Activity.class,
            Ex29Activity.class, Ex30Activity.class, Ex31Activity.class, Ex32Activity.class, Ex33Activity.class,Ex34Activity.class,Ex35Activity.class,
            Ex36Activity.class, Ex37Activity.class, Ex38Activity.class, Ex39Activity.class, Ex40Activity.class, Ex41Activity.class, Ex42upload.class,
            Ex43Activity.class,Ex44Activity.class,Ex45Activity.class};

    @Override

    protected void initmycreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.listView);

        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_list_item_1, zuoye);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(ZuoYe.this, clazz[position]);
                startActivity(i);
            }
        });
    }
}