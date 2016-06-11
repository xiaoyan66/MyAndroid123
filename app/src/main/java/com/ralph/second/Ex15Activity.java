package com.ralph.second;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterViewFlipper;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


/**
 * Created by 果占先 on 2016/5/19.
 */
public class Ex15Activity extends BaseActivity{
    EditText shoujitv;
    TextView jieguotv;
    Handler h = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            Bundle b = msg.getData();
            String str = (String) b.get("str");
            Gson gson=new Gson();
            PhoneCity pc = gson.fromJson(str,PhoneCity.class);

            jieguotv.setText(pc.getRetData().getProvince()+"省"+pc.getRetData().getCity()+"市"+pc.getRetData().getSupplier());
        }
    };
    @Override
    public void initmycreate(Bundle savedInstanceState) {
        setContentView(R.layout.ex15_layout);
        shoujitv= (EditText) findViewById(R.id.shoujihao);
        jieguotv= (TextView) findViewById(R.id.jieguo);
    }
    public void chaxun(View view){
        (new Thread(){
            @Override
            public void run() {
                String httpUrl = "http://apis.baidu.com/apistore/mobilenumber/mobilenumber";
                BufferedReader reader = null;
                String result = null;
                StringBuffer sbf = new StringBuffer();
                httpUrl = httpUrl + "?phone="+shoujitv.getText().toString();

                try {
                    URL url = new URL(httpUrl);
                    HttpURLConnection connection = (HttpURLConnection) url
                            .openConnection();
                    connection.setRequestMethod("GET");
                    // 填入apikey到HTTP header
                    connection.setRequestProperty("apikey",  "562bafef6007883e2e8fffbbdfa9e6ac");
                    connection.connect();
                    InputStream is = connection.getInputStream();
                    reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
                    String strRead = null;
                    while ((strRead = reader.readLine()) != null) {
                        sbf.append(strRead);
                        sbf.append("\r\n");
                    }
                    reader.close();
                    result = sbf.toString();

                    Message m = new Message();
                    Bundle b = new Bundle();
                    b.putSerializable("str",result);
                    m.setData(b);
                    h.sendMessage(m);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
