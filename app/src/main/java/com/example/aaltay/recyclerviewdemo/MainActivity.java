package com.example.aaltay.recyclerviewdemo;

import android.graphics.Movie;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<DataModel> datalist  = new ArrayList<>();
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    private MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        myAdapter = new MyAdapter(datalist);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(myAdapter);

        prepareData();
    }

    private void prepareData() {

        datalist.add(new DataModel("aaaa" , "bbbb"));
        datalist.add(new DataModel("ccccc" , "ddddd"));
        datalist.add(new DataModel("eeeee" , "ffff"));
        datalist.add(new DataModel("gggg" , "hhhh"));

        myAdapter.notifyDataSetChanged();
    }
}
