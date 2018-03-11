package com.young.desgin.pattern.singleton.main.register;

import java.util.Map;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 单例模式，注册登记式，
 *
 * */
public class BeanFactory {
    private BeanFactory(){}
    private final static Map<String,Object>  registerMap=new ConcurrentHashMap<String,Object>();

   public static synchronized Object getSyncBean(String className){
        if(registerMap.containsKey(className)){
            return registerMap.get(className);
        }
        Object o = null;
        try {
            o = Class.forName(className).newInstance();
            registerMap.put(className, o);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return o;

    }



   public  static  Object getBean(String className){
       if(registerMap.containsKey(className)){
           return registerMap.get(className);
       }
        Object o=null;
       try {
          o= Class.forName(className).newInstance();
          Object r=registerMap.putIfAbsent(className,o);
          if(r!=null){
              o=r;
          }
       } catch (Exception e) {
           e.printStackTrace();
       }
        return o;
   }

}
