package com.ralph.second;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 果占先 on 2016/5/12.
 */
public class Ex01Activity extends BaseActivity {
    Button bn;
    TextView tv;
    @Override
    protected void initmycreate(Bundle savedInstanceState) {

       setContentView(R.layout.ex01_layout);

        bn= (Button) findViewById(R.id.bn);
        tv= (TextView) findViewById(R.id.textView);
        bn.setText("确定");
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Date d = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                String str = sdf.format(d);
                tv.setText(str);
            }
        });

    }
}