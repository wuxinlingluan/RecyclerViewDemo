package com.github.recyclerviewdemo.net;

import com.github.recyclerviewdemo.bean.Appinfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/11/11.
 */
public class WebServer {

    public static List<Appinfo> getAppList() {
        List<Appinfo> list=new ArrayList<>();
        for (int i = 0; i <200 ; i++) {
            Appinfo appinfo=new Appinfo();
            appinfo.name="应用"+i;
            appinfo.url="http://www.github.com"+i;
            list.add(appinfo);
        }
        return list;
    }
}
