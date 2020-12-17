package com.renjie.lambdademo.lambdaStudy.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Auther: fan
 * @Date: 2020/12/14
 * @Description: 集合的遍历
 */
public class Exercise3 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,1,2,3,4,5,6,7,8,9,0);
        //将集合中的每一个元素都带入到方法accept中
        arrayList.forEach(System.out::println);
        //输出集合中所有的偶数
        arrayList.forEach(ele -> {
            if (ele % 2 == 0){
                System.out.print(ele+",");
            }
        });
    }
}
