package com.young.desgin.pattern.factory.demo.test.func;

import com.young.desgin.pattern.factory.demo.func.ChangHongJdf20Factory;
import com.young.desgin.pattern.factory.demo.func.IFactory;

public class DianShiJiFuncFactoryTest {
    public static void main(String[] args) {
        IFactory factory=new ChangHongJdf20Factory();
        factory.getDianShiJi().kaiji();
    }
}
