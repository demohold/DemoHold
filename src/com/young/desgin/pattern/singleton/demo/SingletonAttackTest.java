package com.young.desgin.pattern.singleton.demo;

import com.young.desgin.pattern.singleton.main.lazy.LazyStaticInnerClass;
import com.young.desgin.pattern.singleton.main.notice.LazyStaticInnerClassConstructorSafe;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class SingletonAttackTest {
    public static void main(String[] args) {
//        Class<?> clazz= CCTV2DianShiTai.class;
//        try {
//            Constructor constructor=clazz.getDeclaredConstructor(null);
//            constructor.setAccessible(true);//强制执行
//            Object o1=constructor.newInstance();
//            Object o2=constructor.newInstance();//
//            //这里会获得两次对象，破坏了单例设计原则。
//            System.out.println(o1);
//            System.out.println(o2);
//            System.out.println(o1==o2);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        Class<?> clazz2= CCTV3DianShiTai.class;
        try {
            Constructor constructor=clazz2.getDeclaredConstructor(null);
            constructor.setAccessible(true);//强制执行
            Object o1=constructor.newInstance();

            Field[] f=clazz2.getDeclaredFields();
            Class[] class4=clazz2.getDeclaredClasses();
            f[1].setAccessible(true);
            System.out.println(class4[1].getFields()[1]);
            System.out.println(o1);
            System.out.println(f[1]);
            class4[1].getEnumConstants();
            f[1].set(o1,class4[1].getEnumConstants()[1]);


//            System.out.println(class4.length);
//            System.out.println(class4[0]);
//            System.out.println(class4[1]);
//            System.out.println(class4[1].getFields()[1]);

//            Field[] mm=class4[0].getDeclaredFields();
//            mm[1].setAccessible(true);
//            mm[1].setBoolean(class4[0],false);
//            System.out.println(mm[1].setBoolean(););
//            System.out.println(f.length);
//            f[1].setAccessible(true);

//            f[0].setBoolean(o1,false);
            Object o2=constructor.newInstance();//
//            //这里会获得两次对象，破坏了单例设计原则。
//            System.out.println(o1);
//            System.out.println(o2);
            System.out.println(o1==o2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
