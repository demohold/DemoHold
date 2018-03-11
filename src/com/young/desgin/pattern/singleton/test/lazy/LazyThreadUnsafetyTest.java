package com.young.desgin.pattern.singleton.test.lazy;


import com.young.desgin.pattern.singleton.main.lazy.LazyThreadUnsafety;

import java.util.concurrent.CountDownLatch;

public class LazyThreadUnsafetyTest {
 private final static int count=100;
//    CountDownLatch
public static void main(String[] args) {
    final CountDownLatch latch=new CountDownLatch(count);
    for(int i=0;i<count;i++){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    latch.await();//线程等待，当计数器为0时才会往下执行
                    LazyThreadUnsafety o= LazyThreadUnsafety.getInstance();
                    System.out.println(o);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        latch.countDown();//计数器减一，保证循环结束以后，计数器值归0，然后所有线程同时执行。
    }
    System.out.println("执行结束");
 }
}
