package com.ralph.second;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by xiaoyan on 2016/5/29.
 */
public class ZuoYe extends Activity {
    ListView lv;
    String[] zuoye={"短信验证","单选多选按钮","图片十字布局","进度条","qq布局","百度成语搜索","多选提示框",
            "布局电话本","下拉菜单","自动搜索","百度查菜谱","查自己服务器的菜品","手机归属地查询","飞机大战",
            "画心形","图片改变透明度，局部显示","图片循环显示","弥红灯","弹球游戏","图片联系手机联系人","手机分辨率",
            "选项卡","国际化图片","横竖屏布局"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zuoye);
        ArrayAdapter ap=new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,zuoye);
        lv.setAdapter(ap);
    }
}
