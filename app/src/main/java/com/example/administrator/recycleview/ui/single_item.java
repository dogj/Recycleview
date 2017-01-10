package com.example.administrator.recycleview.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.administrator.recycleview.R;
import com.example.administrator.recycleview.adapter.Adapter;
import com.example.administrator.recycleview.model.Data;

/**
 * Created by Administrator on 2017/1/10.
 */

public class single_item extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.single_item);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rec_list2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Adapter adapter = new Adapter(Data.getListData(), this);
        recyclerView.setAdapter(adapter);
    }




}