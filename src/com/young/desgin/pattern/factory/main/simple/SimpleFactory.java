package com.young.desgin.pattern.factory.main.simple;

import com.young.desgin.pattern.factory.main.entiy.Mengniu;
import com.young.desgin.pattern.factory.main.entiy.Milk;
import com.young.desgin.pattern.factory.main.entiy.Telunsu;
import com.young.desgin.pattern.factory.main.entiy.Yili;


//简单工厂模式，根据不同参数匹配获得不同的工厂对象。
//优点：统一生产产品，用户不需要关心每个品牌牛奶是如何创建的，可以根据自己熟悉的品牌名称进行选择。不关心内部实现，对用户而言相对使用简单
//缺点：用户需要知道每个名牌的名称才能获得具体对象，在使用的时候增加了一定的错误概率，不一定写的名称都可以获得到品牌。
public class SimpleFactory {

    public Milk getMilk(String name){
//        if("蒙牛".equals(name)){
//            return new Mengniu();
//        }else if("伊利".equals(name)){
//            return new Yili();
//        }else if("特仑苏".equals(name)){
//            return new Telunsu();
//        }else {
//            throw new RuntimeException("不能创建这个对象");
//        }
        switch (name){//jdk1.8支持switch使用String类型选择
            case "蒙牛":
                return new Mengniu();
            case "伊利":return new Yili();
            case "特仑苏":return new Telunsu();
            default: throw new RuntimeException("不能创建这个对象");
        }
    }
}
