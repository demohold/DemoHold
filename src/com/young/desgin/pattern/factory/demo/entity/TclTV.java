package com.young.desgin.pattern.factory.demo.entity;

public class TclTV extends DianShiJi {
    public TclTV(PinMu pinmu) {
        super(pinmu);
    }

    @Override
    public String getName() {
        return "TCL";
    }
}
