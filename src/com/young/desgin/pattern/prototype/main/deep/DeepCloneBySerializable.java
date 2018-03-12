package com.young.desgin.pattern.prototype.main.deep;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.*;


/**
 * 深度克隆，通过序列化和反序列化进行深度克隆，所有类需要实现Serializable接口。
 * 实现简单，不需要繁琐的重新创建对象并复制来达到深度克隆效果
 * */
public class DeepCloneBySerializable implements Serializable{
    private DeepTarget target;
    private String name;
    private int id;

    public DeepTarget getTarget() {
        return target;
    }

    public void setTarget(DeepTarget target) {
        this.target = target;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try {
            return deepClone();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return null;
    }
    private Object deepClone() throws IOException, ClassNotFoundException {
        ByteOutputStream bos=new ByteOutputStream();
        ObjectOutputStream oos=new ObjectOutputStream(bos);
        oos.writeObject(this);
        ByteArrayInputStream bis=new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois=new ObjectInputStream(bis);
        return ois.readObject();
    }
}
