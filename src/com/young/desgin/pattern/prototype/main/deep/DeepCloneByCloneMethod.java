package com.young.desgin.pattern.prototype.main.deep;


//深度克隆，这种在clone方法中，吧所有属性重新单独复制，引用对象全部需要重新处理。
//一旦有任何一个属性没有处理到都无法达到完全的深度克隆。
//当属性特别是内部对象很多的时候，实现太过于繁琐。
public class DeepCloneByCloneMethod implements  Cloneable{
    private DeepTarget target;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepCloneByCloneMethod t=(DeepCloneByCloneMethod)super.clone();
        t.setTarget((DeepTarget)target.clone());
        return t;
    }

    public DeepTarget getTarget() {
        return target;
    }

    public void setTarget(DeepTarget target) {
        this.target = target;
    }


}
