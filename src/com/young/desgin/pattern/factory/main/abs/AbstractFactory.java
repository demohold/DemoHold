package com.young.desgin.pattern.factory.main.abs;

import com.young.desgin.pattern.factory.main.entiy.Milk;

//抽象工厂模式，用户主入口是抽象类。不同的品牌提供不同的方法去直接获取。
//用户只需要知道这个抽象类，直接根据方法就知道是什么品牌
public abstract class AbstractFactory {
    //TOM:不使用接口的原因是因为一般抽象工厂创建的对象具有一定的共性，需要根据共性统一处理。
    //不使用类提供方法，
   public abstract Milk getMenuniu();
   public abstract Milk getYili();
   public abstract Milk getTelunsu();
}
