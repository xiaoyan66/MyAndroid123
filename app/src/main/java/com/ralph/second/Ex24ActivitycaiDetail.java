package com.ralph.second;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by xiaoyan on 2016/6/11.
 */
public class Ex24ActivitycaiDetail extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex24cai_layout);

        if(savedInstanceState == null)
        {
            Ex24DetailFragment f = new Ex24DetailFragment();
            Bundle b = new Bundle();
            b.putInt("item_id",getIntent().getIntExtra("item_id",0));
            f.setArguments(b);

            getFragmentManager().beginTransaction().replace(R.id.book_detail_container,f).commit();
        }
    }
}
