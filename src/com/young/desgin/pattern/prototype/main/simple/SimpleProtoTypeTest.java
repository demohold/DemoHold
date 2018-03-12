package com.young.desgin.pattern.prototype.main.simple;

import com.young.desgin.pattern.prototype.main.Target;

import java.util.ArrayList;
import java.util.List;

public class SimpleProtoTypeTest {
    public static void main(String[] args) {
        SimpleProtoType c=new SimpleProtoType();
        Target t=new Target();
        t.setTargetId("111");
        t.setTargetName("111targetName");
        c.setSimpleId(1);
        c.setSimpleName("1simpleName");
        c.setTarget(t);
        List list= new ArrayList<Target>();
        Target t2=new Target();
        t2.setTargetId("222");
        t2.setTargetName("222targetName");
        list.add(t2);
        c.setList(list);
        try {
            SimpleProtoType d=(SimpleProtoType) c.clone();
            System.out.println(c==d);
            System.out.println(c.getTarget()==d.getTarget());
            System.out.println(c.getSimpleName()==d.getSimpleName());
            System.out.println(c.getSimpleId()==d.getSimpleId());
            System.out.println(c.getList()==d.getList());

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
