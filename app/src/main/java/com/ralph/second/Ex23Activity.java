package com.ralph.second;

import android.app.Activity;
import android.app.TabActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TabHost;

/**
 * Created by 果占先 on 2016/5/24.
 */
public class Ex23Activity extends BaseActivity {
    String[] a={"aab","abc","bbc","bac","cca","cba","das"};
    @Override
    public void initmycreate(Bundle savedInstanceState) {
        setContentView(R.layout.ex23_layout);
        AutoCompleteTextView au= (AutoCompleteTextView) findViewById(R.id.auto);
        ArrayAdapter ss=new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,a);
        au.setAdapter(ss);
    }
}
