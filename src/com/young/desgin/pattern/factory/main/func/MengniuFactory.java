package com.young.desgin.pattern.factory.main.func;

import com.young.desgin.pattern.factory.main.entiy.Mengniu;
import com.young.desgin.pattern.factory.main.entiy.Milk;

//方法工厂模式，不同的品牌使用不同的工厂方法，用户使用的时候直接使用对应的工厂模式获得对应的品牌对象。
//优点：用户不必关心细节实现，只关注获取到的结果。用户不会像简单工厂模式一样，有可能获得不到对应的对象。
// 更进一步解耦，不同品牌分别属于不同工厂，每个工厂实现互不影响。
//缺点：用户需要自己去创建一个工厂实例，当内部实现修改，不能创建工厂实例对象（工厂改造），或者重构为抽象对象的时候，
// 则由用户创建的对应的工厂实例全部需要修改。
//TOM:货比三家不知道谁好谁坏，增加了用户的复杂度，一般需要有配置，根据配置去创建对应工厂。
public class MengniuFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new Mengniu();
    }
}
