package com.young.desgin.pattern.factory.demo.func;

import com.young.desgin.pattern.factory.demo.entity.ChanghongTV;
import com.young.desgin.pattern.factory.demo.entity.DianShiJi;
import com.young.desgin.pattern.factory.demo.entity.JinDongFang;


//工厂方法模式，一个工厂只产生一个型号的电视机
//优势：不同类型的电视机之间实现解耦，一个修改不会影响到其他的电视机。
//用户同样不关心具体的电视机的实现，只需要创建对应型号的电视机工厂获得需要的电视机。
//用户不会像简单工厂模式一样，有可能获得不到对应的对象。
//缺点：
//用户在实际使用中还是需要知道对应的品牌型号，增加用户的复杂度。
//用户在实际创建中，不同型号的电视机工厂，需要自己去new。
//复杂结构的创建需要创建的工厂类很多
public class ChangHongJdf20Factory  implements IFactory{
    @Override
    public DianShiJi getDianShiJi() {
        return new ChanghongTV(new JinDongFang(20));
    }
}
