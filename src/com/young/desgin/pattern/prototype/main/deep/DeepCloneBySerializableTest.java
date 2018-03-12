package com.young.desgin.pattern.prototype.main.deep;




public class DeepCloneBySerializableTest {
    public static void main(String[] args) {
        DeepCloneBySerializable c=new DeepCloneBySerializable();
        DeepTarget t=new DeepTarget();
        t.setTargetId("111");
        t.setTargetName("111targetName");
        c.setTarget(t);
        c.setName("222Name");
        c.setId(2222);
        try {
            DeepCloneBySerializable d=(DeepCloneBySerializable) c.clone();
            System.out.println(c==d);
            System.out.println(c.getTarget()==d.getTarget());
            System.out.println(c.getName()+"=="+d.getName()+"=="+(c.getName()==d.getName()));
            System.out.println(c.getId()+"=="+d.getId()+(c.getId()==d.getId()));
            System.out.println(c.getTarget().getTargetName()==d.getTarget().getTargetName());


        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
