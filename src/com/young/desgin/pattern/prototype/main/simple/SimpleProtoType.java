package com.young.desgin.pattern.prototype.main.simple;

import com.young.desgin.pattern.prototype.main.Target;

import java.util.List;
/**
 * 浅克隆。
 * 当前对象在克隆时，创建新的对象，但是新的对象的内部对象和当前对象的内部对象的引用地址是同一个地址
 * 修改一个对象中的引用对象的属性，会导致另一个对象中引用对象的值同时发生改变，无法达到两个对象互不影响的作用
*  clone方法是Object的通用方法，但是要实现浅克隆则必须要实现Cloneable接口。
* */
public class SimpleProtoType implements  Cloneable{
    private Target target;
    private String simpleName;
    private int simpleId;
    private List<Target> list;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public String getSimpleName() {
        return simpleName;
    }

    public void setSimpleName(String simpleName) {
        this.simpleName = simpleName;
    }

    public int getSimpleId() {
        return simpleId;
    }

    public void setSimpleId(int simpleId) {
        this.simpleId = simpleId;
    }

    public List<Target> getList() {
        return list;
    }

    public void setList(List<Target> list) {
        this.list = list;
    }
}
