package com.young.desgin.pattern.factory.demo.entity;

public abstract class DianShiJi {
    private PinMu pinmu;
    public DianShiJi(PinMu pinmu){this.pinmu=pinmu;}
    public void kaiji(){
        System.out.println(getName()+"电视开机了,电视机使用"+pinmu.getName()+"屏幕，大小为"+pinmu.getSize());
    }
    public abstract String getName();
}
