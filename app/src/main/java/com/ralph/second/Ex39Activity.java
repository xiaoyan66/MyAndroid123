package com.ralph.second;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by xiaoyan on 2016/6/11.
 */
public class Ex39Activity extends BaseActivity {
    EditText dianhua;
    EditText duanxin;
    Button fasong;
    SmsManager sm;
    ArrayList<String> sendlist=new ArrayList<String>();
    @Override
    protected void initmycreate(Bundle savedInstanceState) {
        setContentView(R.layout.ex39_layout);
        sm=SmsManager.getDefault();
        dianhua= (EditText) findViewById(R.id.dianhuahao);
        duanxin= (EditText) findViewById(R.id.duanxin);
        fasong= (Button) findViewById(R.id.send);
        fasong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num=dianhua.getText().toString();
                String[] nums=num.split("@");
                for(int i=0;i<nums.length;i++){
                    sendlist.add(nums[i]);
                }
                for(String nm:sendlist){
                    PendingIntent p=PendingIntent.getActivity(Ex39Activity.this,0,new Intent(),0);
                    sm.sendTextMessage(nm,null,duanxin.getText().toString(),p,null);
                }
                Toast.makeText(Ex39Activity.this, "发送完毕", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
