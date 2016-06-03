package com.ralph.second;

import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ${肖岩} on 2016/6/3.
 */
public class Ex34Activity extends BaseActivity {
    ListView lv;
    TextView tv;
    Button bt;
    File file;
    File[] files;
    @Override
    protected void initmycreate(Bundle savedInstanceState) {
        setContentView(R.layout.ex34_layout);
        lv= (ListView) findViewById(R.id.lv);
        tv= (TextView) findViewById(R.id.tv);
        bt= (Button) findViewById(R.id.bt);

        File root=new File("/mnt/sdcard");
        if(root.exists()){
            file=root;
            files=root.listFiles();
            try {
                inflateListView(files);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(files[i].isFile())
                    return;
                    File[] tmp=files[i].listFiles();
                    if(tmp==null|tmp.length==0){
                        Toast.makeText(Ex34Activity.this,"不存在",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        file=files[i];
                        files=tmp;
                        try {
                            inflateListView(files);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
        });
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if(!file.getCanonicalPath().equals("/mnt/sdcard")){
                        file=file.getParentFile();
                        files=file.listFiles();
                        inflateListView(files);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
    private void inflateListView(File[] files) throws IOException {
        List<Map<String,Object>> lists=new ArrayList<Map<String,Object>>();
        for (int i=0;i<files.length;i++){
            Map<String,Object> list=new HashMap<String,Object>();
            if(files[i].isDirectory()){
                list.put("icon",R.drawable.file);
            }
            else {
                list.put("icon",R.drawable.home);
            }
            list.put("filename",files[i].getName());
            lists.add(list);
        }
        SimpleAdapter s=new SimpleAdapter(this,lists,R.layout.line,new String[]{"icon","filename"},new int[]{R.id.icon,R.id.file_name});
        lv.setAdapter(s);
        tv.setText("当前路径"+file.getCanonicalPath());
    }
}
