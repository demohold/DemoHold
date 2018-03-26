package com.young.desgin.pattern.factory.demo.abs;

import com.young.desgin.pattern.factory.demo.entity.DianShiJi;
import com.young.desgin.pattern.factory.demo.entity.PinMu;
import com.young.desgin.pattern.factory.demo.entity.TclTV;

public class TCLFactory implements IDianshijiFactory{
    @Override
    public DianShiJi getDianShiJi(PinMu pm) {
        return new TclTV(pm);
    }
}
