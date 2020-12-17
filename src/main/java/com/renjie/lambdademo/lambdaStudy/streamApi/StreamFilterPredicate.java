package com.renjie.lambdademo.lambdaStudy.streamApi;


import com.renjie.lambdademo.lambdaStudy.streamApi.model.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Auther: fan
 * @Date: 2020/12/15
 * @Description: Stream处理对象数以及谓词复用（Stream管道流filter）
 */
public class StreamFilterPredicate {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,23,"M","Rick1","Beethovan1");
        Employee e2 = new Employee(2,13,"F","Rick2","Beethovan2");
        Employee e3 = new Employee(3,43,"M","Rick3","Beethovan3");
        Employee e4 = new Employee(4,26,"F","Rick4","Beethovan4");
        Employee e5 = new Employee(5,79,"M","Rick5","Beethovan5");

        List<Employee> employees = Arrays.asList(e1,e2,e3,e4,e5);

        List<Employee> employeeList = employees.stream()
//                .filter(e -> e.getGender().equals("M") && e.getAge() > 70)
                .filter(
                        Employee.ageGreaterThan70
                                .and(Employee.genderM)
//                                .or(Employee.genderM)
                                //取反
                                .negate()
                )
                .collect(Collectors.toList());
        System.out.println(employeeList);
    }
}
