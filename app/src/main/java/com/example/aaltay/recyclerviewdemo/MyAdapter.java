package com.example.aaltay.recyclerviewdemo;

import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by aaltay on 6.01.2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<DataModel> dataModelList;

    public class MyViewHolder extends  RecyclerView.ViewHolder{

        TextView mytext;
        ImageView myimage;

        public MyViewHolder(View itemView) {
            super(itemView);
            mytext = (TextView) itemView.findViewById(R.id.mytext);
            myimage = (ImageView) itemView.findViewById(R.id.myimage);
        }
    }


    public MyAdapter(List<DataModel> dataModelList) {
        this.dataModelList = dataModelList;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.myrow , parent , false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        DataModel dataRow = dataModelList.get(position);
        holder.mytext.setText(dataRow.yazi);
    }


    @Override
    public int getItemCount() {
        return dataModelList.size();
    }
}
