package com.ralph.second;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by ${肖岩} on 2016/6/1.
 */
public class Ex31Activity extends BaseActivity{
    ImageView iv;
    Button bt1;
    Button bt2;
    AnimationDrawable ad;
    @Override
    protected void initmycreate(Bundle savedInstanceState) {
        iv= (ImageView) findViewById(R.id.img);
        bt1= (Button) findViewById(R.id.button1);
        bt2= (Button) findViewById(R.id.button2);
        ad = (AnimationDrawable) iv.getBackground();
    }

    public void play(View view){
    ad.start();
}
    public void stop1(View view){
        ad.stop();
    }
}
