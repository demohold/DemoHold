package com.young.desgin.pattern.singleton.main.notice;

//单例模式，懒加载方式，使用静态内部类初始化对象。
//静态内部类只有当前类被调用的时候才会进行初始化，并且是在方法调用之前初始化完成。
//优点：线程安全，懒加载，效率较高
public class LazyStaticInnerClassConstructorSafe {
    private static boolean initialized=false;
    private  LazyStaticInnerClassConstructorSafe(){//简易处理防止多次创建，但是仍然可以通过获取属性修改属性值后再次创建。
        synchronized (LazyStaticInnerClassConstructorSafe.class) {
            if (!initialized) {
                initialized=true;
            }else{
                throw new RuntimeException("不能再次初始化实例");
            }
        }

    }
    private static  class   LazyStaticInnerClassHolder{
        private final static LazyStaticInnerClassConstructorSafe instance=new LazyStaticInnerClassConstructorSafe();
    }
    public  final static LazyStaticInnerClassConstructorSafe getInstance(){
        return LazyStaticInnerClassHolder.instance;
    }
}
