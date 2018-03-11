package com.young.desgin.pattern.singleton.test.register;

import com.young.desgin.pattern.singleton.main.register.BeanFactory;
import com.young.desgin.pattern.singleton.main.register.RegisterMap;

import java.util.concurrent.CountDownLatch;

public class RegisterMapTest {
    private final static int count=100;
    public static void main(String[] args) {
        CountDownLatch latch=new CountDownLatch(count);
        for(int i=0;i<count;i++){

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        latch.await();
                        RegisterMap bean=RegisterMap.getInstanceOfSync();
                        System.out.println(bean);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
            latch.countDown();
        }



    }
}
