package com.young.desgin.pattern.factory.demo.abs;

import com.young.desgin.pattern.factory.demo.entity.DianShiJi;

public class AbsDianShiJiFactoryImpl extends AbsDianShiJiFactory{
    @Override
    public DianShiJi getChangHongJdf20() {
        return new ChangHongFactory().getDianShiJi(new JinDongFang20Factory().getPinMu());
    }

    @Override
    public DianShiJi getChangHongSanxin50() {
        return new ChangHongFactory().getDianShiJi(new Sanxinpin50Factory().getPinMu());
    }

    @Override
    public DianShiJi getTCLSanxin20() {
        return new TCLFactory().getDianShiJi(new SanxinPin20Factory().getPinMu());
    }

    @Override
    public DianShiJi getTCLSanxin50() {
        return new TCLFactory().getDianShiJi(new Sanxinpin50Factory().getPinMu());

    }
}
