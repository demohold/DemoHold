package com.young.desgin.pattern.factory.demo.test.simple;

import com.young.desgin.pattern.factory.demo.simple.DianShiJiSimpleFactory;

public class DianShiJiSimpleFactoryTest {
    public static void main(String[] args) {
        DianShiJiSimpleFactory factory= new DianShiJiSimpleFactory();
        factory.getDianShiji("长虹三星屏50").kaiji();
    }
}
