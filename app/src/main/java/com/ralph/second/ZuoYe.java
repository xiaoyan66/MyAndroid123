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
    String[] zuoye = {"hello world！", "放一个图片", "获取手机信息 分辨率 ", "图片轮循", "画心", "完成布局", "霓虹灯闪烁",
            "完成布局", "完成计算器布局界面", "飞机拖动", "点击图片，连到通讯录的一个电话号码", "完成布局", "radio", "短信验证码",
            "弹球游戏", "百度API手机归属地查询", "利用百度API做一个菜谱查询（带图片的）", "完成布局", "下拉列表", "类似淘宝头部的自动播放", "列表点击后跳转页面显示点击的项目详情",
            "自动播放图片类 每隔三秒显示不同的View", "控制透明度", "图片上传"};
    Class[] clazz = {Ex01Activity.class, Ex02Activity.class, Ex03Activity.class, Ex04Activity.class,
            Ex05Activity.class, Ex06Activity.class, Ex07Activity.class, Ex08Activity.class,
            Ex09Activity.class, Ex10Activity.class, Ex11Activity.class, Ex12Activity.class, Ex13Activity.class, EX14Activity.class,
            Ex15Activity.class, Ex16Activity.class, Ex17Activity.class, Ex18Activity.class, Ex19Activity.class, Ex20Activity.class,
            Ex21Activity.class, Ex22Activity.class, Ex23Activity.class, Ex24Activity.class, Ex25Activity.class, Ex26Activity.class,
            Ex27Activity.class, Ex28Activity.class};

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