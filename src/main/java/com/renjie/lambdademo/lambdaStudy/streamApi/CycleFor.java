package com.renjie.lambdademo.lambdaStudy.streamApi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @Auther: fan
 * @Date: 2020/12/15
 * @Description: Stream代替for循环
 */
public class CycleFor {
    public static void main(String[] args) throws IOException {
        List<String> names = Arrays.asList("zhangsan","lisi","langwu","zhaoliu","sunqi");
        List<String> list = names.stream()
                //过滤出s开头的
                .filter(s -> s.startsWith("s"))
                //把s开头的元素变成大写
                .map(String::toUpperCase)
                //排序
                .sorted()
                //再转回list
                .collect(toList());
        System.out.println(list.toString());

        //数组转换成Stream处理
        String[] strings = {"zhangsan","lisi","langwu","zhaoliu","sunqi"};
        String l = Stream.of(strings)
                .filter(s -> s.startsWith("l"))
                .map(String::toUpperCase).sorted()
                .collect(toList())
                .toString();
        System.out.println(l);

        //Set转换成Stream处理
        Set<String> set = new HashSet<>(names);
        List<String> stringList = set.stream()
                .filter(s -> s.startsWith("l"))
                .map(String::toUpperCase).sorted()
                .collect(toList());
        System.out.println(stringList.toString());

        //处理txt文件中的数据
        Path path = Paths.get("file.txt");
        Stream<String> stringStream = Files.lines(path);
        //stringStream.xxx



    }
}
