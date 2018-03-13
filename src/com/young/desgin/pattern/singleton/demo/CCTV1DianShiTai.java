package com.young.desgin.pattern.singleton.demo;

import com.young.desgin.pattern.prototype.demo.Film;

import java.io.Serializable;

/**
* 单例模式，饿汉模式，饿汉模式保证线程安全，在类一开始加载的时候就已经实例化好静态对象
 * 当需要的时候直接使用，但是如果一直不使用的时候就一直存在在内存中，占用内存空间。
 * 另外需要在实现过程中,如果当前类实现了Serializable的话，最好加上readResolve()方法，防止需要反序列化过程中创建多个对象。
 * 在jvm反序列化过程中会调用readResolve()方法获得返回对象，没有则会重新实例化.
 * 当前这种写法可以被反射攻击。
* */
public class CCTV1DianShiTai implements  DianShiTai , Serializable {
    private final String name="CCTV1";
    private CCTV1DianShiTai(){}
    private final static CCTV1DianShiTai instance=new CCTV1DianShiTai();
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void playFilm(Film film) {
        System.out.println(getName()+"正在播放电影："+film.getName()+"，主演："+film.getPersonList().get(0).getName());
    }

    public  final static CCTV1DianShiTai getInstance(){
        return instance;
    }
    public Object readResolve(){
        return instance;
    }

}
