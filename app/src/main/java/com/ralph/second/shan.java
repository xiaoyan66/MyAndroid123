package com.ralph.second;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Message;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by ${肖岩} on 2016/5/31.
 */
public class shan extends View {
    public shan(Context context) {
        super(context);
    }
    int shu=5;
    Paint p=new Paint();
    Paint p1=new Paint();
    Paint p2=new Paint();
    Paint p3=new Paint();
    Paint p4=new Paint();
    int[] list={Color.BLUE,Color.RED,Color.YELLOW,Color.GREEN,Color.BLACK};
    Handler h=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what==0x111){
                p.setColor(list[shu%5]);
                p1.setColor(list[(shu+1)%5]);
                p2.setColor(list[(shu+2)%5]);
                p3.setColor(list[(shu+3)%5]);
                p4.setColor(list[(shu+4)%5]);
                shu++;
            }
            invalidate();
        }
    };

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if(shu==5){
            Timer t=new Timer();
            t.schedule(new TimerTask() {
                @Override
                public void run() {
                    Message m=new Message();
                    m.what=0x111;
                    h.sendMessage(m);

                }
            },100,1500);}

        canvas.drawRect(100,100,600,600,p);
        canvas.drawRect(200,200,500,500,p1);
        canvas.drawRect(300,300,400,400,p2);
        canvas.drawRect(400,400,300,300,p3);
        canvas.drawRect(420,420,280,280,p4);


    }

}
