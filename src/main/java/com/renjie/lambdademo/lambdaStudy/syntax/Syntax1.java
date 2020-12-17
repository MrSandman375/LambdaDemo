package com.renjie.lambdademo.lambdaStudy.syntax;


import com.renjie.lambdademo.lambdaStudy.interfaces.*;

/**
 * @Auther: fan
 * @Date: 2020/12/12
 * @Description: 简单的实现接口
 */
public class Syntax1 {
    public static void main(String[] args) {
        // (): 用来描述参数列表
        // {}: 用来描述方法体(具体的处理逻辑)
        // ->: Lambda运算符，读作goes to

        //无参无返回
        LambdaNoneReturnNoneParameter lambda1 = () -> {
            System.out.println("无参无返回:"+"hello lambda");
        };
        lambda1.test();

        //无返回值单个参数
        LambdaNoneReturnSingleParamteter lambda2 = (int n) -> {
            System.out.println("无返回值单个参数："+n);
        };
        lambda2.test(10);

        //无返回值多个参数
        LambdaNoneReturnMultiParameter lambda3 = (int a, int b) -> {
            System.out.println("无返回值多个参数：" + (a + b));
        };
        lambda3.test(10,20);

        //有返回值无参数
        LambdaSingleReturnNoneParameter lambda4 = () -> {
            return 13;
        };
        int lambda4Return = lambda4.test();
        System.out.println("有返回值无参数："+lambda4Return);

        //有返回值单个参数
        LambdaSingleReturnSingleParameter lambda5 = (int n) ->{
            return n;
        };
        int lambda5Return = lambda5.test(13);
        System.out.println("有返回值单个参数：" + lambda5Return);

        //有返回值多个参数
        LambdaSingleReturnMultiParameter lambda6 = (int a, int b) -> {
            return a + b;
        };
        int lambda6Return = lambda6.test(10, 20);
        System.out.println("有返回值多个参数：" + lambda6Return);
    }
}
