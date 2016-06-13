package com.ralph.second;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;


/**
 * Created by ${肖岩} on 2016/6/12.
 */
public class Ex43Activity extends BaseActivity implements SensorEventListener{
    ImageView image;

    float degree;

    SensorManager sm;
    @Override
    protected void initmycreate(Bundle savedInstanceState) {
        setContentView(R.layout.ex43_layout);
        image = (ImageView) findViewById(R.id.iv);
        sm = (SensorManager) getSystemService(SENSOR_SERVICE);
    }

    @Override
    protected void onResume() {
        super.onResume();
        sm.registerListener(this,sm.getDefaultSensor(Sensor.TYPE_ORIENTATION),sm.SENSOR_DELAY_GAME);
    }

    @Override
    protected void onPause() {
        sm.unregisterListener(this);
        super.onPause();
    }

    @Override
    protected void onStop() {
        sm.unregisterListener(this);
        super.onStop();
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
            int se=sensorEvent.sensor.getType();
       switch (se)
       {
           case Sensor.TYPE_ORIENTATION:
               float jiao=sensorEvent.values[0];
               RotateAnimation ra=new RotateAnimation(degree,-jiao, Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
               ra.setDuration(200);
               image.startAnimation(ra);
               degree=-jiao;
               break;
       }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}
