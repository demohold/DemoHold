package com.young.desgin.pattern.factory.demo.func;

import com.young.desgin.pattern.factory.demo.entity.DianShiJi;
import com.young.desgin.pattern.factory.demo.entity.JinDongFang;
import com.young.desgin.pattern.factory.demo.entity.TclTV;

public class TCLJdf50Factory implements IFactory {
    @Override
    public DianShiJi getDianShiJi() {
        return new TclTV(new JinDongFang(50));
    }
}
