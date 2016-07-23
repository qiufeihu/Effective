package com.qfh.object.impl;

import com.qfh.object.Provider;
import com.qfh.object.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by QiuFeihu on 16/7/23.
 */
public class ServiceImpl implements Service {

    private ServiceImpl(){};

    private static final Map<String,Provider> providers = new ConcurrentHashMap<String,Provider>();

    public static void registerDefalutProvider(Provider p){

    }

    public static  void registerProvider(String name,Provider p){
        providers.put(name,p);
    }

    private static Service newInstance(){
        return newInstance();
    }

    private static Service newInstanc(String name){
        Provider p = providers.get(name);
        if(p == null){
            throw new IllegalArgumentException("无法注册这个类"+name);
        }
        return null;
    }

}
