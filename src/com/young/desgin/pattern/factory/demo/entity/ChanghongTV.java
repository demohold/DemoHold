package com.young.desgin.pattern.factory.demo.entity;

public class ChanghongTV extends DianShiJi {

    public ChanghongTV(PinMu pinmu) {
        super(pinmu);
    }

    @Override
    public String getName() {
        return "长虹";
    }
}
