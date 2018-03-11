package com.young.desgin.pattern.singleton.main.lazy;


//单例模式，懒汉加载，使用的时候再加载
//优点：延时加载，
//缺点：线程不安全
public class LazyThreadUnsafety {
    private  static  LazyThreadUnsafety instance=null;
    private LazyThreadUnsafety(){}

    public  static LazyThreadUnsafety getInstance(){
        if(instance==null){
            instance=new LazyThreadUnsafety();
        }
        return instance;
    }

}
