package com.ralph.second;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

/**
 * Created by ${肖岩} on 2016/5/30.
 */
public class Ex28Activity extends BaseActivity {
    Button an;
    Calendar curr=Calendar.getInstance();
    @Override
    protected void initmycreate(Bundle savedInstanceState) {
        setContentView(R.layout.ex28_layout);
        an= (Button) findViewById(R.id.nao);
        an.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar curr=Calendar.getInstance();
                new TimePickerDialog(Ex28Activity.this, 0, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        Intent i=new Intent(Ex28Activity.this,Ex39Activity.class);
                        PendingIntent pi=PendingIntent.getActivity(Ex28Activity.this,0,i,0);
                        Calendar c=Calendar.getInstance();
                        c.setTimeInMillis(System.currentTimeMillis());
                        c.set(Calendar.HOUR_OF_DAY,hourOfDay);
                        c.set(Calendar.MINUTE,minute);
                        AlarmManager am= (AlarmManager) getSystemService(ALARM_SERVICE);
                        am.set(AlarmManager.RTC_WAKEUP,c.getTimeInMillis(),pi);
                        Toast.makeText(Ex28Activity.this, "成功设置", Toast.LENGTH_SHORT).show();
                    }
                },curr.get(Calendar.HOUR_OF_DAY),curr.get(Calendar.MINUTE),false).show();
            }
        });

    }
}
