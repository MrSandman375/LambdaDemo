package com.renjie.lambdademo.lambdaStudy.streamApi;

import com.renjie.lambdademo.lambdaStudy.streamApi.model.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @Auther: fan
 * @Date: 2020/12/16
 * @Description: 字符串排序
 */
public class SortList {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Milan","london","San Francisco","Tokyo","New Delhi");

        System.out.println(cities);
        //[Milan, London, San Francisco, Tokyo, New Delhi]

        //不管大小写直接按照字母顺序排序
        cities.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println(cities);
        //[London, Milan, New Delhi, San Francisco, Tokyo]

        //先大写后小写且按照字母的顺序
        cities.sort(Comparator.naturalOrder());
        System.out.println(cities);
        //[London, Milan, New Delhi, San Francisco, Tokyo]

        //对象排序
        Employee e1 = new Employee(1,23,"M","Rick1","Beethovan1");
        Employee e2 = new Employee(2,13,"F","Rick2","Beethovan2");
        Employee e3 = new Employee(3,43,"M","Rick3","Beethovan3");
        Employee e4 = new Employee(4,26,"F","Rick4","Beethovan4");
        Employee e5 = new Employee(5,79,"M","Rick5","Beethovan5");

        List<Employee> employees = Arrays.asList(e1,e2,e3,e4,e5);
        employees.sort(Comparator.comparing(Employee::getGender)
                //倒序
                .thenComparing(Employee::getAge)
                .reversed()
        );
        //都是正序，不加reversed
        //都是倒序，最后加一个reversed
        //先是倒序（加reversed），然后正序
        //先是正序（加reversed），然后倒序（加reversed）
        employees.forEach(ele -> {
            System.out.println(ele);
        });

    }
}
