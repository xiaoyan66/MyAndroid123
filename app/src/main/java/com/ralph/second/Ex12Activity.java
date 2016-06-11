package com.ralph.second;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by 果占先 on 2016/5/19.
 */
public class Ex12Activity extends BaseActivity {
    @Override
    public void initmycreate(Bundle savedInstanceState) {
        setContentView(R.layout.ex12_layout);
        rg= (RadioGroup) findViewById(R.id.xingbie);
        cb1= (CheckBox) findViewById(R.id.checkBox);
        cb2= (CheckBox) findViewById(R.id.checkBox2);
        cb3= (CheckBox) findViewById(R.id.checkBox3);

    }
    RadioGroup rg;
    CheckBox cb1;
    CheckBox cb2;
    CheckBox cb3;
    int xingbei;

    public  void  xianshi(View view){
        xingbei=rg.getCheckedRadioButtonId();
        String x="";
        String z="";
        if(xingbei==R.id.nv){
            x="女";
        }else if(xingbei==R.id.nan){
            x="男";
        }
        if(cb1.isChecked()){
            z="专科，";
        }
        if(cb2.isChecked()){
            z=z+"本科，";
        }
        if(cb3.isChecked()){
            z=z+"研究生";
        }
        String xian="你选择的性别是"+x+",学历是"+z;
        Toast.makeText(Ex12Activity.this, xian, Toast.LENGTH_SHORT).show();
    }

}
