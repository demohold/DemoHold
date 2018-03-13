package com.young.desgin.pattern.singleton.main.notice;

import com.young.desgin.pattern.singleton.main.hungry.Hungry;
import com.young.desgin.pattern.singleton.main.lazy.LazyDoubleCheck;
import com.young.desgin.pattern.singleton.main.lazy.LazyStaticInnerClass;
import com.young.desgin.pattern.singleton.main.lazy.LazyThreadSafety;
import com.young.desgin.pattern.singleton.main.lazy.LazyThreadUnsafety;
import com.young.desgin.pattern.singleton.main.register.BeanFactory;
import com.young.desgin.pattern.singleton.main.register.ColorEnum;
import com.young.desgin.pattern.singleton.main.register.RegisterMap;
import com.young.desgin.pattern.singleton.test.register.Bean;


public class SpeedTest {
    private final static int count=9000000;

    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        for(int i=0;i<count;i++){
            Object o= Hungry.getInstance();
        }
        System.out.println("饿汉模式：时间="+(System.currentTimeMillis()-start));
        start=System.currentTimeMillis();
        for(int i=0;i<count;i++){
            LazyThreadUnsafety o= LazyThreadUnsafety.getInstance();
        }
        System.out.println("懒汉模式（非线程安全）：时间="+(System.currentTimeMillis()-start));
        start=System.currentTimeMillis();
        for(int i=0;i<count;i++){
            LazyThreadSafety o=LazyThreadSafety.getInstance();
        }
        System.out.println("懒汉模式（线程安全synchronized）：时间="+(System.currentTimeMillis()-start));
        start=System.currentTimeMillis();
        for(int i=0;i<count;i++){
            LazyStaticInnerClass o=LazyStaticInnerClass.getInstance();
        }
        System.out.println("懒汉模式（静态内部类）：时间="+(System.currentTimeMillis()-start));
        start=System.currentTimeMillis();
        for(int i=0;i<count;i++){
            ColorEnum o=ColorEnum.RED;
        }
        System.out.println("注册登记式（枚举）：时间="+(System.currentTimeMillis()-start));
        start=System.currentTimeMillis();
        for(int i=0;i<count;i++){
            Bean o=(Bean)BeanFactory.getBean(Bean.class.getName());
        }
        System.out.println("注册登记式（putIfAbsent）：时间="+(System.currentTimeMillis()-start));
        start=System.currentTimeMillis();
        for(int i=0;i<count;i++){
            Bean o=(Bean)BeanFactory.getSyncBean(Bean.class.getName());
        }
        System.out.println("注册登记式（Synchronized）：时间="+(System.currentTimeMillis()-start));
        start=System.currentTimeMillis();
        for(int i=0;i<count;i++){
            RegisterMap bean=RegisterMap.getInstanceOfSync();
        }
        System.out.println("注册登记式（RegisterMap -- sync）：时间="+(System.currentTimeMillis()-start));
        start=System.currentTimeMillis();
        for(int i=0;i<count;i++){
            RegisterMap bean=RegisterMap.getInstance();
        }
        System.out.println("注册登记式（RegisterMap -- putIfAbsent）：时间="+(System.currentTimeMillis()-start));
        start=System.currentTimeMillis();
        for(int i=0;i<count;i++){
            LazyDoubleCheck bean=LazyDoubleCheck.getInstance();
        }
        System.out.println("懒加载（双重检测）：时间="+(System.currentTimeMillis()-start));

    }



}
