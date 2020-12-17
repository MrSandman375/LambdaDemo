package com.renjie.lambdademo.lambdaStudy.streamApi;

import java.util.Arrays;
import java.util.List;

/**
 * @Auther: fan
 * @Date: 2020/12/15
 * @Description: 平面展开的map
 */
public class StreamMap3 {
    public static void main(String[] args) {
        //map无法处理多维数组的情况
        List<String> words = Arrays.asList("Hello","Stream");
        words.stream()
                .map(w -> Arrays.stream(w.split("")))//[[H,e,l,l,o],[S,t,r,e,a,m]]
                .forEach(System.out::println);

        //所以会用到flatMap()
        words.stream()
                .flatMap(w -> Arrays.stream(w.split("")))
                .forEach(System.out::print);
    }
}
