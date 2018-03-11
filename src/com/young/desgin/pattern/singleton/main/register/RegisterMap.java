package com.young.desgin.pattern.singleton.main.register;

import java.util.concurrent.ConcurrentHashMap;

public class RegisterMap {
    private RegisterMap() {
    }
    private static  final ConcurrentHashMap<String,RegisterMap> registerMap=new ConcurrentHashMap<String,RegisterMap>();

    public static RegisterMap getInstance(){

        RegisterMap o=registerMap.get("RegisterMap");
        if(o==null){
            RegisterMap m=new RegisterMap();
            o=registerMap.putIfAbsent("RegisterMap",m);
            if(o==null){
                o=m;
            }
        }
        return o;
    }

    public synchronized  static RegisterMap getInstanceOfSync(){

        RegisterMap o=registerMap.get("RegisterMap");
        if(o==null){
            o=new RegisterMap();
            registerMap.putIfAbsent("RegisterMap",o);
        }
        return o;
    }
}
