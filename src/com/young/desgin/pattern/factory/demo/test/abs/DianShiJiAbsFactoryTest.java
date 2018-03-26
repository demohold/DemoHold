package com.young.desgin.pattern.factory.demo.test.abs;

import com.young.desgin.pattern.factory.demo.abs.AbsDianShiJiFactory;
import com.young.desgin.pattern.factory.demo.abs.AbsDianShiJiFactoryImpl;

public class DianShiJiAbsFactoryTest {
    public static void main(String[] args) {
        AbsDianShiJiFactory factory=new AbsDianShiJiFactoryImpl();
        factory.getTCLSanxin50().kaiji();
    }
}
