package com.ralph.second;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by 果占先 on 2016/5/24.
 */
public class Ex24Activity extends Activity implements Ex24ListFragment.Callback {
    boolean twoPan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cai1);

        if(findViewById(R.id.book_detail_container)!=null)
        {
            twoPan = true;
        }
    }


    @Override
    public void onItemSelected(Integer id) {
        if(twoPan)
        {
            Bundle b = new Bundle();
            b.putInt("item_id",id);

            Ex24DetailFragment f = new Ex24DetailFragment();
            f.setArguments(b);

            getFragmentManager().beginTransaction().replace(R.id.book_detail_container,f).commit();
        }else{
            Intent i = new Intent(this,Ex24ActivitycaiDetail.class);
            i.putExtra("item_id",id);
            startActivity(i);
        }
    }
}
