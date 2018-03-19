package com.young.desgin.pattern.factory.test.simple;

import com.young.desgin.pattern.factory.main.simple.SimpleFactory;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimpleFactory factory=new SimpleFactory();
        System.out.println(factory.getMilk("特仑苏"));
    }
}
