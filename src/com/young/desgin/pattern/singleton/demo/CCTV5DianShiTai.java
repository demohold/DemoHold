package com.young.desgin.pattern.singleton.demo;


import com.young.desgin.pattern.prototype.demo.Film;

import java.util.concurrent.ConcurrentHashMap;

/**
 *注册登记式，利用线程安全的ConcurrentHashMap来实现，使用putIfAbsent方法保证插入数据多线程安全。
 * 这里的使用效率比使用synchronize关键字效率高不了多少，整体创建效率测试感觉差不多。见SpeedTest测试类
 * */
public class CCTV5DianShiTai implements DianShiTai {
    private CCTV5DianShiTai(){}
    private static  final ConcurrentHashMap<String,CCTV5DianShiTai> registerMap=new ConcurrentHashMap<String,CCTV5DianShiTai>();
    private final static String name="CCTV5";
    public static CCTV5DianShiTai getInstance(String name){
        if(name==null||name.isEmpty())name=CCTV5DianShiTai.class.getName();
         CCTV5DianShiTai o=registerMap.get(name);
         if(o==null){
            CCTV5DianShiTai m=new CCTV5DianShiTai();
            o=registerMap.putIfAbsent(name,m);
            if(o==null){
                o=m;
            }
        }
        return o;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void playFilm(Film film) {

    }
}
