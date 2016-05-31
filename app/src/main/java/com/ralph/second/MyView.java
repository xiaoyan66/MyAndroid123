package com.ralph.second;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 果占先 on 2016/5/12.
 */
public class MyView extends View implements View.OnTouchListener{

    public MyView(Context context) {
        super(context);

    }
    List<xin> list=new ArrayList<xin>();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint p = new Paint();



        p.setAntiAlias(true);
        p.setStrokeWidth(5);
        for (xin mm:list) {
            p.setColor(mm.getCol());
            for (float i = -2; i <= 2; i += 0.001) {
                float iy = (float) Math.sqrt(2 * Math.sqrt(i * i) - i * i);
                double oy =  -2.14 * Math.sqrt(Math.sqrt(2) - Math.sqrt(Math.abs(i)));
                float ooy = (float) oy;
                canvas.drawPoint(i * 100 + mm.getX(), -iy * 100 + mm.getY(), p);
                canvas.drawPoint(i * 100 + mm.getX(), -ooy * 100 + mm.getY(), p);

            }
        }
    }
    @Override
    public boolean onTouch(View v, MotionEvent event) {
        xin b=new xin();
        if(event.getAction()==MotionEvent.ACTION_DOWN){
            float x=event.getX();
            float y= event.getY();
            b.setX(x);
            b.setY(y);
            int c=0xff000000+(int)(Math.random()*0xffffff);
            b.setCol(c);
            list.add(b);
            invalidate();
        }

        return true;
    }


}
