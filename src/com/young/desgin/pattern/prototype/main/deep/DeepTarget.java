package com.young.desgin.pattern.prototype.main.deep;

import java.io.Serializable;

public class DeepTarget implements  Cloneable,Serializable{
    private  String targetName;
    private  String targetId;

    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
