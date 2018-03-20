package com.young.desgin.pattern.factory.demo.entity;

public abstract class PinMu {
    private int size;
    public PinMu(int size){this.size=size;}
    public abstract String getName();
    public  int getSize(){ return size;}
}
