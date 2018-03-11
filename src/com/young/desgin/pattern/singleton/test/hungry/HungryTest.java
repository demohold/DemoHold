package com.young.desgin.pattern.singleton.test.hungry;

import com.young.desgin.pattern.singleton.main.hungry.Hungry;

public class HungryTest {
    public static void main(String[] args) {
        for(int i=0;i<100;i++) {
            Hungry h = Hungry.getInstance();
            System.out.println(h);
        }
    }
}
