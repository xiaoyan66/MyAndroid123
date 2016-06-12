package com.ralph.second;

import android.app.Activity;
import android.app.ListFragment;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by xiaoyan on 2016/6/11.
 */
public class Ex24ListFragment extends ListFragment {
    Callback callback;
    public interface Callback
    {
        public void onItemSelected(Integer id);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayAdapter aa = new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_activated_1,android.R.id.text1,Ex24lei.ITEMS);
        setListAdapter(aa);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Activity ac = (Activity) context;
        if(!(ac instanceof Callback))
        {
            throw new RuntimeException("没有实现Callback接口");
        }
        callback = (Callback) context;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if(!(activity instanceof Callback))
        {
            throw new RuntimeException("没有实现Callback接口");
        }
        callback = (Callback) activity;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        callback = null;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Ex24lei.cai c = Ex24lei.ITEMS.get(position);
        callback.onItemSelected(c.id);
    }
}