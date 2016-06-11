package com.ralph.second;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.QuickContactBadge;

/**
 * Created by 果占先 on 2016/5/19.
 */
public class Ex11Activity extends BaseActivity {
    @Override
    public void initmycreate(Bundle savedInstanceState) {
        setContentView(R.layout.tongxunlu);
        QuickContactBadge qq= (QuickContactBadge) findViewById(R.id.qu);
        qq.assignContactFromPhone("4001666888",true);

    }
}
