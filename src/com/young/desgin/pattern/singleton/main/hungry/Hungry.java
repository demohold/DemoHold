package com.young.desgin.pattern.singleton.main.hungry;

//单例模式，饿汉模式，类一开始加载就初始化出一个对象。
//优点：线程安全，创建简单
//缺点：如果不使用会一直占用，存在浪费现象，不能延时加载。
public class Hungry {
    private final static    Hungry hungry=new Hungry();
    private Hungry(){}

    public   static Hungry getInstance(){
        return hungry;
    }
}
