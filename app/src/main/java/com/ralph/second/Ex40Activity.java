package com.ralph.second;

import android.app.Activity;
import android.graphics.PixelFormat;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import java.io.File;

/**
 * Created by xiaoyan on 2016/6/11.
 */
public class Ex40Activity extends BaseActivity {
    VideoView vv;
    MediaController mc;

    @Override
    protected void initmycreate(Bundle savedInstanceState) {
        setContentView(R.layout.ex40_layout);
        vv= (VideoView) findViewById(R.id.shipin);
        getWindow().setFormat(PixelFormat.TRANSLUCENT);
        mc=new MediaController(this);
        File video=new File("/mnt/sdcard/mm.mp4");
        if(video.exists()){
            vv.setVideoPath(video.getAbsolutePath());
            vv.setMediaController(mc);
            mc.setMediaPlayer(vv);
            vv.requestFocus();
        }
    }
}
