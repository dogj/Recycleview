package com.example.administrator.recycleview.model;

/**
 * Created by Administrator on 2017/1/9.
 */

public class ListItem {
    private String titles;
    private int imageResId;

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }

    public void setTitles(String titles) {
        this.titles = titles;
    }

    public int getImageResId() {

        return imageResId;
    }

    public String getTitles() {
        return titles;
    }
}
