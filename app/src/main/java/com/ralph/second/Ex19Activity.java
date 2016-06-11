package com.ralph.second;

import android.app.Activity;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import android.widget.ViewSwitcher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Created by 果占先 on 2016/5/24.
 */
public class Ex19Activity extends PreferenceActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (hasHeaders()) {
            Button button = new Button(this);
            button.setText("保存设置");
            setListFooter(button);
        }
    }
    @Override
    public void onBuildHeaders(List<Header> target) {
        loadHeadersFromResource(R.xml.xitongshezhi,target);
    }

    @Override
    protected boolean isValidFragment(String fragmentName) {
        return true;
    }

    public static class beijinyinyue extends PreferenceFragment
    {
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.beijingyinyue);
        }
    }
}
