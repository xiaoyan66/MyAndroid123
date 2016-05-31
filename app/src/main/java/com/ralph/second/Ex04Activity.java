package com.ralph.second;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by 果占先 on 2016/5/17.
 */
public class Ex04Activity extends BaseActivity {

    int[] a={R.drawable.icon_11,R.drawable.icon_13,R.drawable.icon_16,R.drawable.icon_18,R.drawable.icon_28};
    int i=1;

    @Override
    protected void initmycreate(Bundle savedInstanceState) {

        setContentView(R.layout.ex04_layout);
    }

    public void huan(View view){
        ImageView im= (ImageView) findViewById(R.id.imageView);
        im.setImageResource(a[i%5]);
        i++;
    }
}