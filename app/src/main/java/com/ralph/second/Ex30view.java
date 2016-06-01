package com.ralph.second;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

/**
 * Created by ${肖岩} on 2016/6/1.
 */
public class Ex30view extends View implements View.OnTouchListener{

    Bitmap bp;

    Button bt;

    Matrix m;

    int width;

    int height;

    float degrees;
    int screenWidth;
    int screenHeight;


    public Ex30view(Context context) {
        super(context);
        bp = BitmapFactory.decodeResource(getResources(),R.drawable.airplane);
        m = new Matrix();
        degrees = 0.0f;

        width = bp.getWidth();
        height = bp.getHeight();

        DisplayMetrics mm = getResources().getDisplayMetrics();
        screenWidth = mm.widthPixels;
        screenHeight = mm.heightPixels;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m.reset();
        m.setRotate(degrees,screenWidth/2,screenHeight/2);
        Paint p = new Paint();
        canvas.drawBitmap(bp,m,p);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        float x = event.getX();
        switch (event.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                if(x<screenWidth/2)
                {
                    degrees -= 10;
                }else {
                    degrees += 10;
                }
                invalidate();
                break;
        }
        return false;
    }
}
