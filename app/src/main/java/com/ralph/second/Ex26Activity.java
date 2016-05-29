package com.ralph.second;

import android.app.ActionBar;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by 果占先 on 2016/5/26.
 */
public class Ex26Activity extends AppCompatActivity {
    TextView txt;

    PopupMenu popm;

    ActionBar ab;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex26_layout);
        txt = (TextView) findViewById(R.id.txt);
        registerForContextMenu(txt);
//        ab = getActionBar();
//        ab.setDisplayShowHomeEnabled(false);
//        ab.setDisplayHomeAsUpEnabled(true);
//        ab.setTitle("");
        Toolbar toolbar= (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inf =new MenuInflater(this);
        inf.inflate(R.menu.ex26menu,menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        menu.add(0,0x211,0,"红色");
        menu.add(0,0x212,1,"绿色");
        menu.add(0,0x213,2,"蓝色");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case 0x211:
                txt.setTextColor(Color.RED);
                break;
            case 0x212:
                txt.setTextColor(Color.GREEN);
                break;
            case 0x213:
                txt.setTextColor(Color.BLUE);
                break;
        }
        return true;
    }


    public void showActionBar(View view)
    {
        ab.show();
    }
    public void hideActionBar(View view)
    {
        ab.hide();
    }
}
