package com.ralph.second;

import android.app.Activity;
import android.graphics.Matrix;
import android.os.Bundle;
import android.widget.Button;

/**
 * Created by ${肖岩} on 2016/6/1.
 */
public class Ex30Activity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Ex30view view = new Ex30view(this);
        view.setOnTouchListener(view);
        setContentView(view);
    }
}
