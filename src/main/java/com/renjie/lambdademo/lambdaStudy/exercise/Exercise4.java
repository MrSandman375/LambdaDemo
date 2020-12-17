package com.renjie.lambdademo.lambdaStudy.exercise;


import com.renjie.lambdademo.lambdaStudy.data.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: fan
 * @Date: 2020/12/14
 * @Description:
 */
public class Exercise4 {
    public static void main(String[] args) {
        //删除集合中满足条件的元素
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("张三",35));
        personList.add(new Person("李四",32));
        personList.add(new Person("王五",30));
        personList.add(new Person("赵六",29));
        personList.add(new Person("孙七",26));
        //删除集合中年龄大于30岁的元素
        /**
        ListIterator<Person> iterator = personList.listIterator();
        while (iterator.hasNext()){
            Person person = iterator.next();
            if (person.getAge() > 30){
                iterator.remove();
            }
        }
        */
        //Lambda实现
        //将集合中的每一个元素都带入到test方法中，如果返回值是true，则删除这个元素
        personList.removeIf(person -> person.getAge() > 30);

        System.out.println(personList);
    }
}
