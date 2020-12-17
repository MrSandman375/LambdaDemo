package com.renjie.lambdademo.lambdaStudy.exercise;


import com.renjie.lambdademo.lambdaStudy.data.Person;

import java.util.Set;
import java.util.TreeSet;

/**
 * @Auther: fan
 * @Date: 2020/12/14
 * @Description: 综合案例之：TreeSet
 */
public class Exercise2 {
    public static void main(String[] args) {

        //使用Lambda表达式来实现Comparator接口，并实例化一个TreeSet对象
        Set set = new TreeSet<Person>((o1, o2) -> {
            //这里没有直接使用o2.getAge() - o1.getAge()是因为相减Comparator返回值为零会被认为两个相同，set就会去重
            if (o1.getAge() >= o2.getAge()){
                return -1;
            }else {
                return 1;
            }
        });
        set.add(new Person("张三",35));
        set.add(new Person("李四",32));
        set.add(new Person("王五",30));
        set.add(new Person("周八",26));
        set.add(new Person("赵六",29));
        set.add(new Person("孙七",26));
        System.out.println(set);
    }
}
