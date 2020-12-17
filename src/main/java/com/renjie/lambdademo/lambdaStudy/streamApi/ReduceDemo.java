package com.renjie.lambdademo.lambdaStudy.streamApi;

import com.renjie.lambdademo.lambdaStudy.streamApi.model.Employee;

import java.util.Arrays;
import java.util.List;

/**
 * @Auther: fan
 * @Date: 2020/12/17
 * @Description: 集合元素归约
 */
public class ReduceDemo {
    public static void main(String[] args) {
        /*----------------------------------------*/
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        Integer total = numbers.stream()
                //reduce(初始值,实现BinaryOperator<T>)  求和
                .reduce(0, (subtotal, element) -> subtotal + element);
        Integer totalSimple = numbers.stream().reduce(0,Integer::sum);
        System.out.println(total+"or"+totalSimple);

        /*----------------------------------------*/
        List<String> letters = Arrays.asList("a","b","c","d","e","f");
        String pinjie = letters.stream()
                //拼接字符串
                .reduce("", (subtotal, element) -> subtotal.concat(element) );
        String pinjieSimple = letters.stream().reduce("", String::concat);
        System.out.println(pinjie+"或"+pinjieSimple);

        /*----------------------------------------*/
        Employee e1 = new Employee(1,23,"M","Rick1","Beethovan1");
        Employee e2 = new Employee(2,13,"F","Rick2","Beethovan2");
        Employee e3 = new Employee(3,43,"M","Rick3","Beethovan3");
        Employee e4 = new Employee(4,26,"F","Rick4","Beethovan4");
        Employee e5 = new Employee(5,79,"M","Rick5","Beethovan5");

        List<Employee> employees = Arrays.asList(e1,e2,e3,e4,e5);

        //串行的方式
        Integer ageSum = employees.stream()
                .map(Employee::getAge)//拿到所有的年龄
                //累加
                .reduce(0, Integer::sum);
        System.out.println(ageSum);

        //并行的方式（更快），更好的利用处理器的多核心
        Integer reduce = employees.parallelStream().map(Employee::getAge).reduce(0, Integer::sum);
        System.out.println(reduce);

        //如果不使用map也要累加年龄
        Integer totalAge = employees.stream()
                .reduce(0, (subTotal, emp) -> subTotal + emp.getAge(), Integer::sum);
    }
}
