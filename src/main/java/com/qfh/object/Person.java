package com.qfh.object;

/**
 * 人类
 */
public class Person {

    private final String name;
    private final int age;
    private final String sex;

    //构造函数
    public Person(Builder builder){
        name = builder.name;
        age = builder.age;
        sex = builder.sex;
    }

    //类构建器
    public static class Builder {

        private String name;
        private int age;
        private String sex;


        public Builder(String name){
            this.name = name;
        }


        public Builder age(int age){
            this.age = age; return this;
        }

        public Builder sex(String sex){
            this.sex = sex; return this;
        }

        //创建对象返回
        public Person build(){
            return new Person(this);
        }


    }


    @Override
    public java.lang.String toString() {
        return "Person{" +
                "name=" + name +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

}
