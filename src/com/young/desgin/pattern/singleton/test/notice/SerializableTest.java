package com.young.desgin.pattern.singleton.test.notice;

import com.young.desgin.pattern.singleton.main.notice.SerializableHasResolve;
import com.young.desgin.pattern.singleton.main.notice.SerializableNoResolve;

import java.io.*;

public class SerializableTest {
    public static void main(String[] args) {
        SerializableHasResolve s1;
        SerializableHasResolve s2 = SerializableHasResolve.getInstance();
        try {
            FileOutputStream fos=new FileOutputStream("serializable.obj");
            ObjectOutputStream oos= null;
            try {
                oos = new ObjectOutputStream(fos);
                oos.writeObject(s2);
                oos.flush();
                oos.close();

                FileInputStream fis=new FileInputStream("serializable.obj");
                ObjectInputStream ois=new ObjectInputStream(fis);
                s1=(SerializableHasResolve)ois.readObject();
                System.out.println("以下是有readResolve的单例进行反序列化-------------------------");
                System.out.println(s1);
                System.out.println(s2);
                System.out.println(s1==s2);

            } catch (Exception e) {
                e.printStackTrace();
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        SerializableNoResolve s3;
        SerializableNoResolve s4 = SerializableNoResolve.getInstance();
        try {
            FileOutputStream fos=new FileOutputStream("serializableno.obj");
            ObjectOutputStream oos= null;
            try {
                oos = new ObjectOutputStream(fos);
                oos.writeObject(s4);
                oos.flush();
                oos.close();

                FileInputStream fis=new FileInputStream("serializableno.obj");
                ObjectInputStream ois=new ObjectInputStream(fis);
                s3=(SerializableNoResolve)ois.readObject();
                System.out.println("以下是有readResolve的单例进行反序列化-------------------------");
                System.out.println(s3);
                System.out.println(s4);
                System.out.println(s3==s4);

            } catch (Exception e) {
                e.printStackTrace();
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
