package com.renjie.lambdademo.lambdaStudy.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Auther: fan
 * @Date: 2020/12/15
 * @Description: Stream管道流map
 */
public class StreamMap1 {
    public static void main(String[] args) {

        List<String> anm = Arrays.asList("Monkey","Lion","Giraffe","Lemur");

        //不使用Stream管道流
        List<String> anmUpper = new ArrayList<>();
        for (String s : anm) {
            anmUpper.add(s.toUpperCase());
        }
        System.out.println(anmUpper);//[MONKEY, LION, GIRAFFE, LEMUR]

        //使用Stream管道流转换大小写
        List<String> anmUp = anm.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(anmUp);//[MONKEY, LION, GIRAFFE, LEMUR]
        //取字符串长度
        List<Integer> anmLength = anm.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(anmLength);//[6, 4, 7, 5]

    }
}
