package com.example.administrator.recycleview.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.example.administrator.recycleview.R;
import com.example.administrator.recycleview.adapter.Adapter;
import com.example.administrator.recycleview.model.Data;

public class MainActivity extends AppCompatActivity{

    private Button button1;
    private Button button2;


//    private RecyclerView recyclerView;
//    private Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.administrator.recycleview.ui.single_item");
                startActivity(intent);
            }
        });


//        recyclerView= (RecyclerView)findViewById(R.id.rec_list);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//
//        adapter = new Adapter(Data.getListData(),this);
//        recyclerView.setAdapter(adapter);


    }
}
