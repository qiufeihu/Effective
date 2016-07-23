package com.qfh.object;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Demo01 {

    /**
     * 静态工厂方法
     */
    public static Boolean valueOf(boolean b) {
        return b ? Boolean.TRUE : Boolean.FALSE;
    }

    public static <k,v> HashMap<k,v> newInstance(){
        return new HashMap<k,v>();
    }

    public static void main(String[] args) {
        //演示
        Boolean a = valueOf(1==1);
        System.out.println(a);

        Map<String,String> map = newInstance();
        map.put("xiaomi","小米");
        System.out.print(map.get("xiaomi"));


    }
}
