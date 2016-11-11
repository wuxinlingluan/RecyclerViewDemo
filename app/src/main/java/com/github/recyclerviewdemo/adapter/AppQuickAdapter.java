package com.github.recyclerviewdemo.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.github.recyclerviewdemo.R;
import com.github.recyclerviewdemo.bean.Appinfo;

import java.util.List;

/**
 * Created by Administrator on 2016/11/11.
 */
public class AppQuickAdapter extends BaseQuickAdapter<Appinfo>{
    public AppQuickAdapter(List<Appinfo> data) {
        super(R.layout.item_apps,data);
    }

    @Override
    protected void convert(BaseViewHolder baseViewHolder, Appinfo appinfo) {
        baseViewHolder.setText(R.id.tv1,appinfo.name).setText(R.id.tv2,appinfo.url).linkify(R.id.tv2);
    }
}
