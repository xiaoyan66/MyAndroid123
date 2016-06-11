package com.ralph.second;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by 果占先 on 2016/5/19.
 */
public class EX14Activity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EX14view v=new EX14view(this);
        v.setOnTouchListener(v);
        setContentView(v);
    }
}
