package com.ralph.second;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by xiaoyan on 2016/6/11.
 */
public class Ex24DetailFragment extends Fragment {
    Ex24lei.cai c;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(getArguments().containsKey("item_id"))
        {
            c = Ex24lei.ITEM_MAP.get(getArguments().getInt("item_id"));
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.caidetail,container,false);
        if(c != null)
        {
            TextView title = (TextView) view.findViewById(R.id.book_title);
            TextView desc = (TextView) view.findViewById(R.id.book_desc);

            title.setText(c.title);
            desc.setText(c.desc);
        }
        return view;
    }
}

