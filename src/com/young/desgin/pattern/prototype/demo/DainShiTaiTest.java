package com.young.desgin.pattern.prototype.demo;

import com.young.desgin.pattern.singleton.demo.CCTV1DianShiTai;
import com.young.desgin.pattern.singleton.demo.CCTV2DianShiTai;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DainShiTaiTest {
    public static void main(String[] args) {
        Film f=new Film();
        f.setDate(new Date());
        f.setName("功夫");
        f.setSize("2g");
        Person p=new Person();
        p.setName("周星驰");
        p.setAge(30);
        List<Person> list=new ArrayList<Person>();
        list.add(p);
        f.setPersonList(list);

        Film f2= null;
        try {
            f2 = (Film) f.clone();
            System.out.println(f==f2);
            CCTV1DianShiTai.getInstance().playFilm(f);
            CCTV2DianShiTai.getInstance().playFilm(f2);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
