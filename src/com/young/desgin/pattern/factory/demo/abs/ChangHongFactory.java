package com.young.desgin.pattern.factory.demo.abs;

import com.young.desgin.pattern.factory.demo.entity.ChanghongTV;
import com.young.desgin.pattern.factory.demo.entity.DianShiJi;
import com.young.desgin.pattern.factory.demo.entity.PinMu;

public class ChangHongFactory implements IDianshijiFactory{
    @Override
    public DianShiJi getDianShiJi(PinMu pm) {
        return new ChanghongTV(pm);
    }
}
