package com.ralph.second;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.Toast;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ${肖岩} on 2016/6/2.
 */
public class Ex33Activity extends BaseActivity {
    GridLayout gl;
    @Override
    public void initmycreate(Bundle savedInstanceState) {
        setContentView(R.layout.ex33_layout);
        gl= (GridLayout) findViewById(R.id.bujiu);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if(newConfig.orientation==(Configuration.ORIENTATION_LANDSCAPE)){
            gl.setColumnCount(3);
        }
        if(newConfig.orientation==(Configuration.ORIENTATION_PORTRAIT)){
            Intent i=new Intent(this,Ex33Activity.class);
            startActivity(i);
        }
    }
}
