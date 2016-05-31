package com.ralph.second;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by 果占先 on 2016/5/17.
 */
public class Ex05Activity  extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        MyView vv = new MyView(this);
        vv.setOnTouchListener(vv);
        setContentView(vv);

    }
}
