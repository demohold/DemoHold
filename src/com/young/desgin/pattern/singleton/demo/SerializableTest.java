package com.young.desgin.pattern.singleton.demo;

import com.young.desgin.pattern.singleton.main.notice.SerializableNoResolve;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableTest {
    private final static int count = 100;

    public static void main(String[] args) {
        CCTV2DianShiTai s3;
        CCTV2DianShiTai s4 = CCTV2DianShiTai.getInstance();

        try {
            FileOutputStream fos = new FileOutputStream("serializableno.obj");
            ObjectOutputStream oos = null;
            oos = new ObjectOutputStream(fos);
            oos.writeObject(s4);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("serializableno.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s3 = (CCTV2DianShiTai) ois.readObject();
            System.out.println(s3);
            System.out.println(s4);
            System.out.println(s3 == s4);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
