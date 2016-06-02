package com.ralph.second;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by ${肖岩} on 2016/6/1.
 */
public class Ex31Activity extends BaseActivity{
    ImageView iv;
    AnimationDrawable ad;
    ImageView iv2;
    @Override
    protected void initmycreate(Bundle savedInstanceState) {
        setContentView(R.layout.ex31_layout);
        iv= (ImageView) findViewById(R.id.img123);
        ad = (AnimationDrawable) iv.getBackground();
    }

    public void play(View view){
    ad.start();
}
    public void stop1(View view){
        ad.stop();
    }
    public void startAnimation(View view)
    {
        Animation a = AnimationUtils.loadAnimation(this,R.anim.anim);
        a.setFillAfter(true);

        iv2.startAnimation(a);
    }
}
