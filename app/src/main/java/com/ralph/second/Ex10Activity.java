package com.ralph.second;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by 果占先 on 2016/5/18.
 */
public class Ex10Activity extends  BaseActivity implements View.OnTouchListener{
    private ImageView myImageView;
    private int screenWidth;
    private int screenHeight;
    private int X,Y;
    private void img() {
        this.myImageView = (ImageView) this.findViewById(R.id.imgView);
        this.myImageView.setOnTouchListener(this);
        DisplayMetrics dm = getResources().getDisplayMetrics();
        screenWidth = dm.widthPixels;
        screenHeight = dm.heightPixels;
    }
    @Override
    protected void initmycreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity01);
        this.img();
    }
    public boolean onTouch(View v, MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                X = (int) event.getRawX();
                Y = (int) event.getRawY();
                break;
            case MotionEvent.ACTION_MOVE:
                int dx = (int) event.getRawX() - X;
                int dy = (int) event.getRawY() - Y;

                int left = v.getLeft() + dx;
                int top = v.getTop() + dy;
                int right = v.getRight() + dx;
                int bottom = v.getBottom() + dy;

                if (left < 0) {
                    left = 0;
                    right = left + v.getWidth();
                }

                if (right > screenWidth) {
                    right = screenWidth;
                    left = right - v.getWidth();
                }

                if (top < 0) {
                    top = 0;
                    bottom = top + v.getHeight();
                }

                if (bottom > screenHeight) {
                    bottom = screenHeight;
                    top = bottom - v.getHeight();
                }
                v.layout(left, top, right, bottom);

                X = (int) event.getRawX();
                Y = (int) event.getRawY();

                break;
            case MotionEvent.ACTION_UP:
                break;
        }
        return true;
    }
}

