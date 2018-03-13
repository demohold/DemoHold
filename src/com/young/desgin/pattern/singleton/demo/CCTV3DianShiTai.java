package com.young.desgin.pattern.singleton.demo;

import com.young.desgin.pattern.prototype.demo.Film;

import java.io.Serializable;

/**
* 单例模式，懒汉模式，利用静态内部内创建，
 * 在运行过程中，只有使用时才开始创建对象，实现延时加载，节省内存占用空间。
 * 这种方式是利用java内部类创建是在当前类使用的时候，并且在方法调用前创建完毕的特性来实现的。
 * 这种实现方式效率较高，线程安全。
 * 另外需要在实现过程中,如果当前类实现了Serializable的话，最好加上readResolve()方法，防止需要反序列化过程中创建多个对象。
 * 在jvm反序列化过程中会调用readResolve()方法获得返回对象，没有则会重新实例化.
 *
 * 根据实际情况确定是否要处理反序列化攻击，下面写的通过属性标志，内部静态类中的属性标志，枚举标志均只能简单防止反序列化攻击，
 * 并不能完全杜绝反序列化攻击。反射可以修改属性，获取到静态内部类的属性再修改，获得枚举类再修改。
 *
* */
public  class CCTV3DianShiTai implements  DianShiTai {
    private final String name="CCTV3";
    private enum CCTV3Enum{
        TRUE,FALSE;
    }
    private static  boolean mf=false;
    private static CCTV3Enum e=CCTV3Enum.FALSE;
    private CCTV3DianShiTai(){
        synchronized (CCTV3DianShiTai.class) {
            if (CCTV3Enum.FALSE == e) {
                e=CCTV3Enum.TRUE;
            }else{
                throw new RuntimeException("单例被破坏");
            }
            if(mf==false){
                mf=true;
            }else{
                throw new RuntimeException("单例被破坏");
            }
//            if(CCTV3InnerHolder.f==false){
//                CCTV3InnerHolder.f=true;
//            }else{
//                throw new RuntimeException("单例被破坏");
//            }
        }
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void playFilm(Film film) {

    }

    public  static CCTV3DianShiTai getInstance(){
        return CCTV3InnerHolder.instance;
    }

    private final static class CCTV3InnerHolder{
        private final static CCTV3DianShiTai instance=new CCTV3DianShiTai();
        private static boolean f=false;
    }


}
