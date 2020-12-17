package com.renjie.lambdademo.lambdaStudy.closure;

import java.util.function.Consumer;

/**
 * @Auther: fan
 * @Date: 2020/12/14
 * @Description: 闭包
 */
public class ClosureDemo2 {
    public static void main(String[] args) {
        int a = 20;
        Consumer<Integer> c = ele -> {
            System.out.println(ele);
        };
        c.accept(a);
    }
}
