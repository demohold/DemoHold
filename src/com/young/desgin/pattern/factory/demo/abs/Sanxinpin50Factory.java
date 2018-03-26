package com.young.desgin.pattern.factory.demo.abs;

import com.young.desgin.pattern.factory.demo.entity.PinMu;
import com.young.desgin.pattern.factory.demo.entity.Sanxing;

public class Sanxinpin50Factory implements IFactoryPinmu {
    @Override
    public PinMu getPinMu() {
        return new Sanxing(getSize());
    }

    @Override
    public int getSize() {
        return 50;
    }
}
