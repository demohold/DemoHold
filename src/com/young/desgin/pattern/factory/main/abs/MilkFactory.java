package com.young.desgin.pattern.factory.main.abs;

import com.young.desgin.pattern.factory.main.entiy.Mengniu;
import com.young.desgin.pattern.factory.main.entiy.Milk;
import com.young.desgin.pattern.factory.main.entiy.Telunsu;
import com.young.desgin.pattern.factory.main.entiy.Yili;

public class MilkFactory extends AbstractFactory {
    @Override
    public Milk getMenuniu() {
        return new Mengniu();
    }

    @Override
    public Milk getYili() {
        return new Yili();
    }

    @Override
    public Milk getTelunsu() {
        return new Telunsu();
    }
}
