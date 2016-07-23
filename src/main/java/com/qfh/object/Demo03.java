package com.qfh.object;

/**
 * Created by QiuFeihu on 16/7/23.
 */
public class Demo03 {


    public static void main(String[] args) {
        Person hulin = new Person.Builder("胡林").age(12).sex("女").build();
        System.out.println(hulin.toString());
        Person xiaomi = new Person.Builder("小米").build();
        System.out.println(xiaomi.toString());
    }


}
