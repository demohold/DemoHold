package com.young.desgin.pattern.factory.demo.func;

import com.young.desgin.pattern.factory.demo.entity.ChanghongTV;
import com.young.desgin.pattern.factory.demo.entity.DianShiJi;
import com.young.desgin.pattern.factory.demo.entity.JinDongFang;

public class ChangHongJdf20Factory  implements IFactory{
    @Override
    public DianShiJi getDianShiJi() {
        return new ChanghongTV(new JinDongFang(20));
    }
}
