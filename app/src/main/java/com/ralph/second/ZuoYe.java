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
    String[] zuoye = {"hello world！", "放一个图片", "获取手机分辨率 ", "点击图片轮循", "画心", "完成布局", "霓虹灯闪烁",
            "完成布局", "完成计算器布局界面", "飞机拖动", "点击图片，连到通讯录的一个电话号码", "完成布局", "radio", "短信验证码",
            "弹球游戏", "百度API手机归属地查询", "利用百度API做一个菜谱查询（带图片的）", "完成布局", "下拉列表", "类似淘宝头部的自动播放", "列表点击后跳转页面显示点击的项目详情",
            "自动播放图片类 每隔三秒显示不同的View", "控制透明度", "图片上传","完成自动搜索功能","商品展示列表ListView","商品展示列表ListView","GridView 分两列显示商品",
            "网络图片", "图形旋转 ","播放动画","SurfaceView画图","手机语言设置不同，显示不同的界面","打电话的练习","ExpandListView和intent传参练习",
            "横,竖屏的时候显示不同的布局","用异步任务的方法下载资源时显示进度条","平板电脑和手机适配", "两个按钮一个回主页面，去百度另一个","三个选项卡", "搜索框，显示对应匹配的信息", "intent跳转 ","Dialog弹出框的练习"};
    Class[] clazz = {Ex01Activity.class, Ex02Activity.class, Ex03Activity.class, Ex04Activity.class,
            Ex05Activity.class, Ex06Activity.class, Ex07Activity.class, Ex08Activity.class,
            Ex09Activity.class, Ex10Activity.class, Ex11Activity.class, Ex12Activity.class, Ex13Activity.class, EX14Activity.class,
            Ex15Activity.class, Ex16Activity.class, Ex17Activity.class, Ex18Activity.class, Ex19Activity.class, Ex20Activity.class,
            Ex21Activity.class, Ex22Activity.class, Ex23Activity.class, Ex24Activity.class, Ex25Activity.class, Ex26Activity.class,
            Ex27Activity.class, Ex28Activity.class, Ex29Activity.class, Ex30Activity.class, Ex31Activity.class, Ex32Activity.class};

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