package com.ralph.second;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initmycreate(savedInstanceState);
        Toolbar t = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(t);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inf = new MenuInflater(this);
        inf.inflate(R.menu.ex26menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.normal_btn:
                new AlertDialog.Builder(this).setIcon(R.drawable.icon_28).setTitle("关于作者").setMessage("肖岩").setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                }).create().show();
                break;
            case android.R.id.home:
                Intent i = new Intent(this,ZuoYe.class);
                startActivity(i);
                break;
        }
        return true;
    }

            protected abstract  void  initmycreate(Bundle savedInstanceState);

}
