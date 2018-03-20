package com.young.desgin.pattern.factory.demo.simple;

import com.young.desgin.pattern.factory.demo.entity.*;

//简单工厂模式，使用方法根据不同类型的参数去创建不同的对象。
//工厂模式创建有一定优势：
//由工厂统一创建，用户不需要关心具体实现。
//简单工厂模式缺点：
//这种写法冗余度较高，复杂对象创建的时候需要判断的类型太多。
//这种写法不符合开闭原则，当有新的电视机种类时需要修改当前方法，有旧的电视种类淘汰时也需要修改当前方法。
//这种写法阅读不易，过于冗长的代码判断会造成一定程度上的阅读困难
//这种写法对用户来说是需要事先知道所有电视机的种类型号才可以创建。对用户学习认知造成一定麻烦。
public class DianShiJiSimpleFactory {

    public DianShiJi getDianShiji(String type){
        if("长虹三星屏20".equals(type)){
            return new ChanghongTV(new Sanxing(20));
        }else if("长虹三星屏50".equals(type)){
            return new ChanghongTV(new Sanxing(50));
        }else if("长虹京东方50".equals(type)){
            return new ChanghongTV(new JinDongFang(50));
        }else if("TCL三星屏20".equals(type)){
            return new TclTV(new Sanxing(20));
        }else{
            throw new RuntimeException("不知道是啥电视啥屏幕的。");
        }
    }


}
