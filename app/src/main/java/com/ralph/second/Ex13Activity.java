package com.ralph.second;

import android.app.Activity;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by 果占先 on 2016/5/19.
 */
public class Ex13Activity extends BaseActivity {
    int i=6;
    Timer t;
    @Override
    public void initmycreate(Bundle savedInstanceState) {
        setContentView(R.layout.ex13_layout);
    }
    android.os.Handler h=new android.os.Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            Button b= (Button) findViewById(R.id.button4);
            if(msg.what==0x111&&i!=0){
                b.setEnabled(false);
                b.setText("发送中..."+i);
                i--;
            }else{
                i=6;
                b.setEnabled(true);
                b.setText("重新获取");
                t.cancel();
            }

        }
    };
    public void yanzheng(View view){

        t=new Timer();
        t.schedule( new TimerTask(){
            @Override
            public void run() {
                Message m=new Message();
                m.what=0x111;
                h.sendMessage(m);
            }
        },100,1000);
    }

}