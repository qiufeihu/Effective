package com.qfh.object;

import java.util.UUID;

/**
 * 学生类
 */
public class Student {

    private String id;
    private String name;
    private int age;
    private String className;
    private String school;

    //创建一个对象工厂方法
    public static Student getNewInstance(String name,int age){
        Student stu = new Student();
        stu.id = UUID.randomUUID().toString();
        stu.name = name;
        stu.age = age;
        return  stu;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }


    //演示
    public static void main(String[] args) {
        Student xiaomi = Student.getNewInstance("小米",12);
        System.out.println(xiaomi.getName());
        System.out.println(xiaomi.getAge());
    }
}
