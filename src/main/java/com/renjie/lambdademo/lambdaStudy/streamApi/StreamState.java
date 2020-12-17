package com.renjie.lambdademo.lambdaStudy.streamApi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Auther: fan
 * @Date: 2020/12/15
 * @Description: Stream有状态操作
 */
public class StreamState {
    public static void main(String[] args) {
        String[] N = {"Monkey","Lion","Giraffe","Lemur","Giraffe"};

        List<String> limitN = Stream.of(N)
                //取前两个
                .limit(2)
                .collect(Collectors.toList());
        System.out.println(limitN);

        List<String> skipN = Stream.of(N)
                //跳过前两个
                .skip(2)
                .collect(Collectors.toList());
        System.out.println(skipN);

        List<String> uniqueN = Stream.of(N)
                //去重
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueN);

        List<String> sortedN = Stream.of(N)
                //默认按照字母顺序排序
                .parallel()//并行操作
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedN);

    }
}
