package com.young.desgin.pattern.prototype.main.deep;

import com.young.desgin.pattern.prototype.main.Target;
import com.young.desgin.pattern.prototype.main.simple.SimpleProtoType;

import java.util.ArrayList;
import java.util.List;

public class DeepCloneByCloneMethodTest {
    public static void main(String[] args) {
        DeepCloneByCloneMethod c=new DeepCloneByCloneMethod();
        DeepTarget t=new DeepTarget();
        t.setTargetId("111");
        t.setTargetName("111targetName");
        c.setTarget(t);
        List list= new ArrayList<Target>();
        Target t2=new Target();
        t2.setTargetId("222");
        t2.setTargetName("222targetName");
        list.add(t2);
        try {
            DeepCloneByCloneMethod d=(DeepCloneByCloneMethod) c.clone();
            System.out.println(c==d);
            System.out.println(c.getTarget()==d.getTarget());
            System.out.println(c.getTarget().getTargetName()==d.getTarget().getTargetName());


        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
