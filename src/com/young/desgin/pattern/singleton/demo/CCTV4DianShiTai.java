package com.young.desgin.pattern.singleton.demo;

import com.young.desgin.pattern.prototype.demo.Film;

/**
* 单例模式，注册登记式，枚举类型
 *
 * 枚举线程安全，效率高，可以完全避免反射攻击。也可以避免反序列化创建多个对象的情况
 * 但是很少使用。
* */
public enum CCTV4DianShiTai implements  DianShiTai {
    INSTANCE {

    };
    @Override
    public String getName() {
        return "CCTV4";
    }
    @Override
    public void playFilm(Film film) {

    }
}
