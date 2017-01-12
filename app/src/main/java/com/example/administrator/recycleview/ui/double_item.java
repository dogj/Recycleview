package com.example.administrator.recycleview.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.administrator.recycleview.R;
import com.example.administrator.recycleview.adapter.Adapter2;
import com.example.administrator.recycleview.model.Data;

/**
 * Created by Administrator on 2017/1/12.
 */

public class double_item extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.double_item);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rec_list3);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Adapter2 adapter = new Adapter2(Data.getListData(), this);
        recyclerView.setAdapter(adapter);
    }




}
