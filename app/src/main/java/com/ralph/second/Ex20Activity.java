package com.ralph.second;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by 果占先 on 2016/5/24.
 */
public class Ex20Activity extends BaseActivity {
    EditText dizhi;
    String wangzhi;
    URL url;
    Handler h = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            Toast.makeText(Ex20Activity.this, "3", Toast.LENGTH_SHORT).show();

        }
    };

    @Override
    public void initmycreate(Bundle savedInstanceState) {
        setContentView(R.layout.ex20_layout);
        dizhi = (EditText) findViewById(R.id.dizhi);
        wangzhi = dizhi.getText().toString();
        try {
            url = new URL("http://img.mp.itc.cn/upload/20160530/18552133911448c08e1ba12fee52199b_th.jpg");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }

    public void xiazai(View view) throws IOException {
        MyTask t = new MyTask(this);
        t.execute(url);
    }
    class MyTask extends AsyncTask<URL,Integer,String>
    {
        Context ctx;
        public MyTask(Context ctx)
        {
            this.ctx = ctx;
        }
        ProgressDialog pd;
        int progressNum = 0;
        @Override
        protected String doInBackground(URL... params) {
            try {
                URLConnection conn = params[0].openConnection();
                InputStream is=conn.getInputStream();
                FileOutputStream os=new FileOutputStream("/mnt/sdcard/ll.jpg");
                byte[] buff=new byte[1];
                int lang=0;
                while((lang=is.read(buff))!=-1){
                    os.write(buff,0,lang);
                    pd.setProgress(progressNum++);
                }
                os.close();
                is.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return "ok";
        }

        @Override
        protected void onPreExecute() {
            pd = new ProgressDialog(ctx);
            pd.setTitle("下载进度");
            pd.setMessage("正在下载");
            pd.setMax(500);
            pd.setCancelable(false);
            pd.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
            pd.setIndeterminate(false);
            pd.show();
        }

        @Override
        protected void onPostExecute(String s) {
            pd.dismiss();
            Intent i=new Intent();
            i.setAction(Intent.ACTION_VIEW);
            i.setDataAndType(Uri.fromFile(new File("/mnt/sdcard/ll.jpg")),"image/jpeg");
            //startActivity(i);
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            pd.setProgress(values[0]);
        }
    }
}

