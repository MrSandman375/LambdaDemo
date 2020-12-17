package com.renjie.lambdademo.lambdaStudy.streamApi;

import com.renjie.lambdademo.lambdaStudy.streamApi.model.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @Auther: fan
 * @Date: 2020/12/17
 * @Description: Stream查找与匹配元素
 */
public class MatchList {
    public static void main(String[] args) {
        //对象排序
        Employee e1 = new Employee(1,23,"M","Rick1","Beethovan1");
        Employee e2 = new Employee(2,13,"F","Rick2","Beethovan2");
        Employee e3 = new Employee(3,43,"M","Rick3","Beethovan3");
        Employee e4 = new Employee(4,26,"F","Rick4","Beethovan4");
        Employee e5 = new Employee(5,79,"M","Rick5","Beethovan5");

        List<Employee> employees = Arrays.asList(e1,e2,e3,e4,e5);

        //用for判断是否存在年龄大于70岁的人
        boolean isExistAgeThan70 = false;
        for (Employee employee:employees) {
            if (employee.getAge() > 70){
                isExistAgeThan70 = true;
                break;
            }
        }
        System.out.println("for循环实现："+isExistAgeThan70);

        //用Stream实现
        //anyMatch():是否存在满足匹配规则的元素，anyMatch()返回值是一个布尔值
        boolean b = employees.stream().anyMatch(ele -> ele.getAge() > 70);
        System.out.println("stream实现："+b);

        //用谓词实现
        boolean w = employees.stream().anyMatch(Employee.ageGreaterThan70);
        System.out.println("谓词实现："+w);

        /*-----------------------------------*/
        //是否所有元素都满足匹配规则,allMatch()
        boolean all = employees.stream().allMatch(ele -> ele.getAge() > 10);
        System.out.println("all："+all);

        //是否不存在满足匹配规则的元素,noneMatch()
        boolean none = employees.stream().noneMatch(ele -> ele.getAge() < 18);
        System.out.println("none：" + none);

        /*-----------------------------------*/
        //元素查找,Optional:java8新特性，如果存在放到optional中，如果不存在抛异常
        employees.stream()
                .filter(ele -> ele.getAge() > 10)//过滤出大于40岁的元素
                .findAny();//findAny()在数据较少的情况下也是返回第一个元素，较多的情况下（并行）就不能确保是第一个
                //.findFirst()//拿到第一个元素
                //.isPresent()//是否存在，建议用anyMatch()
                //.ifPresent(ele-> System.out.println(ele))//如果存在
                //.orElse(new Employee(0,40,"M","Rose","Robot"));//如果不存在
        //employees.forEach(System.out::println);
        //System.out.println(optionalEmployee);
    }
}
