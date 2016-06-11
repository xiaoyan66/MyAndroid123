package com.ralph.second;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xiaoyan on 2016/6/11.
 */
public class Ex24lei {
    public static class cai
    {
        public Integer id;
        public String title;
        public String desc;

        public cai(Integer id, String title, String desc) {
            this.id = id;
            this.title = title;
            this.desc = desc;
        }

        @Override
        public String toString() {
            return title;
        }
    }

    public static List<cai> ITEMS = new ArrayList<cai>();

    public static Map<Integer,cai> ITEM_MAP = new HashMap<Integer,cai>();

    static
    {
        addItem(new cai(1,"油炸大虾","好吃"));
        addItem(new cai(2,"油焖大虾","不好吃"));
        addItem(new cai(3,"大虾","生吃"));
    }

    private static void addItem(cai c)
    {
        ITEMS.add(c);
        ITEM_MAP.put(c.id,c);
    }
}

