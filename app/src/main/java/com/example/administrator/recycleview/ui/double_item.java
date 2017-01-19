package com.example.administrator.recycleview.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

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
        adapter.setOnItemClickListener(new Adapter2.OnRecyclerViewItemClickListener() {
            @Override
            public void onItemClick(View view, String data) {
                Toast.makeText(double_item.this,data,Toast.LENGTH_SHORT).show();
            }
        });
        recyclerView.setAdapter(adapter);
    }




}
