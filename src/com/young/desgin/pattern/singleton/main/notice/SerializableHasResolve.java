package com.young.desgin.pattern.singleton.main.notice;



public class SerializableHasResolve implements java.io.Serializable{
    private final  static SerializableHasResolve instance=new SerializableHasResolve();
    private SerializableHasResolve(){}
    public static SerializableHasResolve getInstance(){
        return instance;
    }
    //readResolve在jvm反序列化过程中会默认先调用readResolve方法获得返回对象，没有该方法则创建实例
    private Object readResolve(){
        return instance;
    }
}
