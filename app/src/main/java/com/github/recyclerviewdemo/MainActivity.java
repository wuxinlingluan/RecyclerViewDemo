package com.github.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.github.recyclerviewdemo.adapter.AppQuickAdapter;
import com.github.recyclerviewdemo.bean.Appinfo;
import com.github.recyclerviewdemo.net.WebServer;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Appinfo> apps= WebServer.getAppList();
        RecyclerView recyclerView= (RecyclerView) findViewById(R.id.rl);
        LinearLayoutManager lm=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(lm);
        AppQuickAdapter adapter=new AppQuickAdapter(apps);
        adapter.openLoadAnimation(BaseQuickAdapter.HEADER_VIEW);
        recyclerView.setAdapter(adapter);
    }
}
