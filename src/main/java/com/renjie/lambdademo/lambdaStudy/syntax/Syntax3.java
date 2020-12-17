package com.renjie.lambdademo.lambdaStudy.syntax;


import com.renjie.lambdademo.lambdaStudy.interfaces.LambdaSingleReturnSingleParameter;

/**
 * @Auther: fan
 * @Date: 2020/12/14
 * @Description: 方法引用
 */
public class Syntax3 {
    public static void main(String[] args) {
        // 方法引用：
        // 可以快速的将一个Lambda表达式的实现指向一个已经实现的方法。
        // 语法：方法的隶属者::方法名

        // 注意：
        // 1、参数数量和类型一定要和接口中定义的方法一致
        // 2、返回值的类型一定要和接口中定义的一致
        LambdaSingleReturnSingleParameter lambda1 = a -> change(a);
        // 方法引用：引用了change方法的实现
        LambdaSingleReturnSingleParameter lambda2 = Syntax3::change;
    }
    private static int change(int a){
        return a * 2;
    }
}
