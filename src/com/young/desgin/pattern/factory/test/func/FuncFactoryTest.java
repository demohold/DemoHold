package com.young.desgin.pattern.factory.test.func;

import com.young.desgin.pattern.factory.main.func.Factory;
import com.young.desgin.pattern.factory.main.func.MengniuFactory;

public class FuncFactoryTest {
    public static void main(String[] args) {
        Factory factory=new MengniuFactory();
        System.out.println(factory.getMilk());
    }
}
