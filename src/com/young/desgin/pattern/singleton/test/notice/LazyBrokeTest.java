package com.young.desgin.pattern.singleton.test.notice;

import com.young.desgin.pattern.singleton.main.lazy.LazyStaticInnerClass;
import com.young.desgin.pattern.singleton.main.notice.LazyStaticInnerClassConstructorSafe;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class LazyBrokeTest {
    public static void main(String[] args) {
        Class<?> clazz= LazyStaticInnerClass.class;
        try {
            Constructor constructor=clazz.getDeclaredConstructor(null);
            constructor.setAccessible(true);//强制执行
            Object o1=constructor.newInstance();
            Object o2=constructor.newInstance();//
            //这里会获得两次对象，破坏了单例设计原则。
            System.out.println(o1);
            System.out.println(o2);
            System.out.println(o1==o2);

        } catch (Exception e) {
            e.printStackTrace();
        }

        Class<?> clazz2= LazyStaticInnerClassConstructorSafe.class;
        try {
            Constructor constructor=clazz2.getDeclaredConstructor(null);
            constructor.setAccessible(true);//强制执行
            Object o1=constructor.newInstance();
            Field[] f=clazz2.getDeclaredFields();
            Class[] class4=clazz2.getDeclaredClasses();
            System.out.println(f.length);
            f[0].setAccessible(true);
            f[0].setBoolean(o1,false);
            Object o2=constructor.newInstance();//
            //这里会获得两次对象，破坏了单例设计原则。
            System.out.println(o1);
            System.out.println(o2);
            System.out.println(o1==o2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
