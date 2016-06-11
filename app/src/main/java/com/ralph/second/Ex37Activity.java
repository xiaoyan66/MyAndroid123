package com.ralph.second;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by xiaoyan on 2016/6/11.
 */
public class Ex37Activity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Ex37view b=new Ex37view(this);
        b.setOnTouchListener(b);
        setContentView(b);
    }
}


