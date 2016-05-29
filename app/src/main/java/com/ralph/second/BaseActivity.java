package com.ralph.second;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

/**
 * Created by 果占先 on 2016/5/26.
 */
public abstract class BaseActivity extends AppCompatActivity {
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initmycreate(savedInstanceState);
        i=new Intent(this,ZuoYe.class);
        Toolbar toolbar= (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.normal_btn:
                        AlertDialog.Builder b=new AlertDialog.Builder(BaseActivity.this)
                                .setTitle("作者详情")
                                .setMessage("作者：肖岩");
                        b.create().show();
                        break;
                    case R.id.search :
                        startActivity(i);
                        break;
                }
                return false;
            }
        });


    }
    protected abstract  void  initmycreate(Bundle savedInstanceState);


    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inf = new MenuInflater(this);
        inf.inflate(R.menu.ex26menu,menu);
        return super.onCreateOptionsMenu(menu);
    }


}
