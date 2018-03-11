package com.young.desgin.pattern.singleton.test.lazy;

import com.young.desgin.pattern.singleton.main.lazy.LazyStaticInnerClass;
import com.young.desgin.pattern.singleton.main.lazy.LazyThreadSafety;

import java.util.concurrent.CountDownLatch;

public class LazyStaticInnerClassTest {
    private final static int count=100;

    public static void main(String[] args) {
        CountDownLatch latch=new CountDownLatch(count);
        for(int i=0;i<count;i++){

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        latch.await();
                        LazyStaticInnerClass safety=LazyStaticInnerClass.getInstance();
                        System.out.println(safety);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
            latch.countDown();
        }

    }
}
