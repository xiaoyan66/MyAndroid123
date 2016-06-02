package com.ralph.second;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ${肖岩} on 2016/6/2.
 */
public class Ex33Activity extends BaseActivity {
    SharedPreferences sp;

    SharedPreferences.Editor editor;

    EditText text;

    ImageView iv;
    @Override
    protected void initmycreate(Bundle savedInstanceState) {
        setContentView(R.layout.ex33_layout);
        text= (EditText) findViewById(R.id.et);
        iv= (ImageView) findViewById(R.id.myimg);
        sp = getSharedPreferences("ex33",MODE_PRIVATE);
        editor = sp.edit();
    }

    public void writeData(View view)
    {
        URL url=

        editor.putString("url",);
        editor.commit();
    }

    public void readData(View view)
    {
        String time = sp.getString("url","没有存放时间");


    }
}
