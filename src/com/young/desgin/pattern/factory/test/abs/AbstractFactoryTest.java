package com.young.desgin.pattern.factory.test.abs;

import com.young.desgin.pattern.factory.main.abs.AbstractFactory;
import com.young.desgin.pattern.factory.main.abs.MilkFactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractFactory abs=new MilkFactory();
        System.out.println(abs.getMenuniu());
    }
}
