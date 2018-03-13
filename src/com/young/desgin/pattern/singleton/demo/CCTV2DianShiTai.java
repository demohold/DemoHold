package com.young.desgin.pattern.singleton.demo;

import com.young.desgin.pattern.prototype.demo.Film;

import java.io.Serializable;

/**
* 单例模式，懒汉模式，使用synchronized关键字保证多线程使用安全，
 * 在运行过程中，只有使用时才开始创建对象，实现延时加载，节省内存占用空间。
 * 但是因为使用synchronize关键字会导致效率降低。
 *
 * 另外需要在实现过程中,如果当前类实现了Serializable的话，最好加上readResolve()方法，防止需要反序列化过程中创建多个对象。
 * 在jvm反序列化过程中会调用readResolve()方法获得返回对象，没有则会重新实例化.
 * 当前这种写法可以被反射攻击。
* */
public class CCTV2DianShiTai implements  DianShiTai , Serializable {
    private final String name="CCTV2";
    private CCTV2DianShiTai(){}
    private static  CCTV2DianShiTai instance;
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void playFilm(Film film) {
        System.out.println(getName()+"正在播放电影："+film.getName()+"，主演："+film.getPersonList().get(0).getName());
    }


    public  synchronized static CCTV2DianShiTai getInstance(){
        if(instance==null){
            instance=new CCTV2DianShiTai();
        }
        return instance;
    }

    public Object readResolve(){
        return instance;
    }


}
