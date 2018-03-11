package com.young.desgin.pattern.singleton.main.lazy;

//单例模式，懒加载，线程安全.
//优点：可以延时加载，线程安全
//缺点：执行效率低
public class LazyThreadSafety {
    private static LazyThreadSafety instance;

    private LazyThreadSafety(){}

    public static synchronized LazyThreadSafety getInstance(){
        if(instance==null){
            instance=new LazyThreadSafety();
        }
        return instance;
    }
}
