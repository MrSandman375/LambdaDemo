package com.renjie.lambdademo.lambdaStudy.syntax;

import com.renjie.lambdademo.lambdaStudy.interfaces.LambdaNoneReturnMultiParameter;
import com.renjie.lambdademo.lambdaStudy.interfaces.LambdaNoneReturnSingleParamteter;
import com.renjie.lambdademo.lambdaStudy.interfaces.LambdaSingleReturnMultiParameter;
import com.renjie.lambdademo.lambdaStudy.interfaces.LambdaSingleReturnNoneParameter;

/**
 * @Auther: fan
 * @Date: 2020/12/14
 * @Description: Lambda基础语法精简
 */
public class Syntax2 {
    public static void main(String[] args) {
        // 语法精简：
        // 1、参数：
        // 由于在接口的抽象方法中，已经定义了参数的数量和类型。所以在Lambda表达式中，参数的类型可以省略
        // 如果需要省略类型，则每一个参数的类型都要省略，不能一个省略参数类型一个不省略
        LambdaNoneReturnMultiParameter lambda1 = (a, b) -> {
            System.out.println("省略掉参数的类型");
            System.out.println(a+b);
        };
        lambda1.test(1,2);
        // 2、参数小括号：
        // 参数列表中，参数的数量只有一个。此时小括号可以省略。
        LambdaNoneReturnSingleParamteter lambda2 = n -> {
            System.out.println("只有一个参数的时候省略小括号");
        };
        lambda2.test(1);
        // 3、方法大括号：
        // 如果方法体中只有一条语句，此时大括号可以省略
        LambdaNoneReturnSingleParamteter lambda3 = n -> System.out.println("只有一条语句时可以省略大括号");
        lambda3.test(1);
        // 4、如果方法体重唯一的一条语句时返回语句,则在省略掉大括号的同时，也必须省略掉return
        LambdaSingleReturnNoneParameter lambda4 = () -> 10;
        System.out.println(lambda4.test());

        LambdaSingleReturnMultiParameter lambda5 = (a, b) -> a + b;
        System.out.println(lambda5.test(1,2));
    }
}
