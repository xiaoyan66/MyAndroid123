package com.ralph.second;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by ${肖岩} on 2016/6/2.
 */
public class Ex32Activity extends BaseActivity{
    SurfaceHolder sh;
    @Override
              protected void initmycreate(Bundle savedInstanceState) {

              setContentView(R.layout.ex32_layout);

                SurfaceView sv = (SurfaceView) findViewById(R.id.myview1);

              sh=sv.getHolder();

              sh.addCallback(new SurfaceHolder.Callback() {

                @Override
              public void surfaceCreated(SurfaceHolder holder) {
                Canvas can = holder.lockCanvas();
                can.drawColor(Color.WHITE);
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.quan1);
                can.drawBitmap(bitmap,300,500,null);
                holder.unlockCanvasAndPost(can);

                holder.lockCanvas(new Rect(500,1000,500,500));
                holder.unlockCanvasAndPost(can);
            }

            @Override
            public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

            }

            @Override
            public void surfaceDestroyed(SurfaceHolder holder) {

            }
        });
    }
}
