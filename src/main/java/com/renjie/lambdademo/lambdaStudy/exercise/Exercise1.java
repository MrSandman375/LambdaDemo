package com.renjie.lambdademo.lambdaStudy.exercise;


import com.renjie.lambdademo.lambdaStudy.data.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: fan
 * @Date: 2020/12/14
 * @Description: 综合案例之：集合排序
 */
public class Exercise1 {
    //集合排序：
    //ArrayList<>
    public static void main(String[] args) {
        //需求：已知在一个ArrayList中有若干个Person对象。将这些Person对象按照年龄进行排序.
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("张三",35));
        personList.add(new Person("李四",32));
        personList.add(new Person("王五",30));
        personList.add(new Person("赵六",29));
        personList.add(new Person("孙七",26));
        //根据年龄倒序排序
        personList.sort((o1,o2) -> o2.getAge() - o1.getAge());
        System.out.println(personList);
    }
}
