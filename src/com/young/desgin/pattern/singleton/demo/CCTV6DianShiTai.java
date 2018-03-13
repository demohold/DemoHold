package com.young.desgin.pattern.singleton.demo;

import com.young.desgin.pattern.prototype.demo.Film;

import java.io.Serializable;

/**
* 单例模式，懒汉模式，双重检测

 * 当前这种写法可以被反射攻击。
* */
public class CCTV6DianShiTai implements  DianShiTai , Serializable {
    private final String name="CCTV6";
    private CCTV6DianShiTai(){}
    private volatile static CCTV6DianShiTai instance;
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void playFilm(Film film) {

    }

    public  static CCTV6DianShiTai getInstance(){
        if(instance==null){
            synchronized (CCTV6DianShiTai.class) {
                if(instance==null) {
                    instance = new CCTV6DianShiTai();
                }
            }
        }
        return instance;
    }

    public Object readResolve(){
        return instance;
    }


}
