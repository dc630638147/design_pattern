package com.af.singleton.seriable;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注册式单例-容器
 * spring中采用的就是这种做法
 */
public class ContainerSingleton {
    private ContainerSingleton() {
    }

    private static Map<String, Object> map = new ConcurrentHashMap<String, Object>();

    public static Object getObject(String className){
        //这里加锁式因为，此处是对getObject进行多线程操作A
       synchronized (map){
           if(!map.containsKey(className)){
               //处理
               Object obj = null;
               try {
                   obj = Class.forName(className).newInstance();
                   map.put(className,obj);
               }catch (Exception e){
                   e.printStackTrace();
               }
               return obj;
           }else{
               return map.get(className);
           }
       }
    }
}
