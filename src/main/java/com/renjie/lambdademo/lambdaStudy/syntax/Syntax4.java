package com.renjie.lambdademo.lambdaStudy.syntax;


import com.renjie.lambdademo.lambdaStudy.data.Person;

/**
 * @Auther: fan
 * @Date: 2020/12/14
 * @Description: 构造方法的引用
 */
public class Syntax4 {
    public static void main(String[] args) {
        PersonCreater creater = () -> new Person();

        // 构造方法的引用
        PersonCreater creater1 = Person::new;
        Person a = creater1.getPerson();

        PerSonCreater2 creater2 = Person::new;
        Person b = creater2.getPerson("张三", 32);
    }
}

@FunctionalInterface
interface PersonCreater{
    Person getPerson();
}

@FunctionalInterface
interface PerSonCreater2{
    Person getPerson(String name, int age);
}
