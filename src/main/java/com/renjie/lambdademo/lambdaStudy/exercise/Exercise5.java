package com.renjie.lambdademo.lambdaStudy.exercise;

/**
 * @Auther: fan
 * @Date: 2020/12/14
 * @Description: 线程的实例化
 */
public class Exercise5 {
    public static void main(String[] args) {
        //开辟一条线程，做一个数字的输出
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(i);
            }
        });
        thread.start();
    }
}
