package com.young.desgin.pattern.factory.demo.abs;

import com.young.desgin.pattern.factory.demo.entity.JinDongFang;
import com.young.desgin.pattern.factory.demo.entity.PinMu;
import com.young.desgin.pattern.factory.demo.entity.Sanxing;

public class JinDongFang50Factory implements IFactoryPinmu {
    @Override
    public PinMu getPinMu() {
        return new JinDongFang(getSize());
    }

    @Override
    public int getSize() {
        return 50;
    }
}
