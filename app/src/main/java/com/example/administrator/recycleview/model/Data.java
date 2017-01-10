package com.example.administrator.recycleview.model;

import com.example.administrator.recycleview.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/1/9.
 */

public class Data {
    private static final String[] titles = {"第二", "第二", "第三"};
    private static final int[] icons = {R.drawable.beiqu, R.drawable.beiyule, R.drawable.bugaoxing};

    public static List<ListItem> getListData() {
        List<ListItem> data = new ArrayList<>();

        for ( int i = 0; i <titles.length&& i<icons.length; i++){
            ListItem item = new ListItem();
            item.setImageResId(icons[i]);
            item.setTitles(titles[i]);
            data.add(item);


        }


        return data;
    }
}
