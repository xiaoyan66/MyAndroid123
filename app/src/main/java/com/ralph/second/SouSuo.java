package com.ralph.second;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.SearchView;

/**
 * Created by Administrator on 16-5-24.
 */
public class SouSuo extends Activity {
    String[] str={"大米","白菜","土豆","地瓜","萝卜"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sou);
        SearchView sv= (SearchView) findViewById(R.id.sss);
        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                return false;
            }
            @Override
            public boolean onQueryTextChange(String newText) {

                return true;
            }
        });
        AutoCompleteTextView txt = (AutoCompleteTextView) findViewById(R.id.searchTxt);
        ArrayAdapter ad = new ArrayAdapter(this,android.R.layout.simple_list_item_1,str);
        txt.setAdapter(ad);
    }
}
