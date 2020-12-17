package com.renjie.lambdademo.lambdaStudy.closure;

import java.util.function.Supplier;

/**
 * @Auther: fan
 * @Date: 2020/12/14
 * @Description: 闭包
 */
public class ClosureDemo {
    public static void main(String[] args) {
        int n = getNumber().get();
        System.out.println(n);
    }
    private static Supplier<Integer> getNumber(){
        int num = 10;
        return () -> {
            return num;
        };
    }
}
