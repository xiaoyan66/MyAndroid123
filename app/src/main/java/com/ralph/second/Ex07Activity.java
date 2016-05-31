package com.ralph.second;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

/**
 * Created by 果占先 on 2016/5/17.
 */
public class Ex07Activity extends  Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DisplayMetrics mm=new DisplayMetrics();
        mm=getResources().getDisplayMetrics();
        int w=mm.widthPixels;
        int h=mm.heightPixels;
        float density=mm.density;
        int densityDpi=mm.densityDpi;
        shan hua=new shan(this);
        setContentView(hua);
    }
}
