package com.example.administrator.recycleview.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.recycleview.R;
import com.example.administrator.recycleview.model.ListItem;

import java.util.List;

/**
 * Created by Administrator on 2017/1/9.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<ListItem> listData;
    private LayoutInflater inflater;

    public Adapter (List<ListItem> listData, Context c){

        this.inflater= LayoutInflater.from(c);
        this.listData= listData;

    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_name,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
            ListItem item =listData.get(position);
            holder.title.setText(item.getTitles());
            holder.icon.setImageResource(item.getImageResId() );
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView title;
        private ImageView icon;
        private View container;

        public MyViewHolder(View itemView) {
            super(itemView);
            title=(TextView)itemView.findViewById(R.id.lbl_item_text);
            icon = (ImageView)itemView.findViewById(R.id.im_item_icon);

            container=itemView.findViewById(R.id.cont_item_root);


        }
    }
}
