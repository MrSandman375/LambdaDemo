package com.renjie.lambdademo.lambdaStudy.data;

/**
 * @Auther: fan
 * @Date: 2020/12/14
 * @Description:
 */
public class Person{
    private String name;
    private int age;

    public Person() {
        System.out.println("Person类的无参构造方法执行了");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person类的有参构造执行了");
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //实现Comparable排序
//    @Override
//    public int compareTo(Person person) {
//        return  person.age - age;
//    }
}
