package com.ralph.second;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.Toast;


/**
 * Created by 果占先 on 2016/5/23.
 */
public class Ex17Activity extends BaseActivity {
    String[] i={"java","jsp","mysql","c","c++"};
    @Override
    public void initmycreate(Bundle savedInstanceState) {
        setContentView(R.layout.ex17_layout);
        Spinner s= (Spinner) findViewById(R.id.xiala);
        ArrayAdapter aa=new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,i);
        s.setAdapter(aa);
        s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String aa="你选择地是"+i[position];
                Toast.makeText(Ex17Activity.this, aa, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
