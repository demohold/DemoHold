package com.young.desgin.pattern.singleton.main.lazy;

//单例模式，懒加载方式，使用静态内部类初始化对象。
//静态内部类只有当前类被调用的时候才会进行初始化，并且是在方法调用之前初始化完成。
//优点：线程安全，懒加载，效率较高
public class LazyStaticInnerClass {
    private LazyStaticInnerClass(){}
    private static  class   LazyStaticInnerClassHolder{
        private final static LazyStaticInnerClass instance=new LazyStaticInnerClass();
    }
    //idea建议不要加final.
    //Reports methods declared final and static.
    // When a static method is overridden in a subclass it can still be accessed via the super class,making a final declaration not very necessary.
    // Declaring a static method final does prevent subclasses form defining a static method with the same signature
    //防止静态方法被重启是需要加上final的，但是当前类是不能被继承的。所以final可以去掉？
    public  final static LazyStaticInnerClass getInstance(){
        return LazyStaticInnerClassHolder.instance;
    }
}
