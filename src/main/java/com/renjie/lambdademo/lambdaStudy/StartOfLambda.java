package com.renjie.lambdademo.lambdaStudy;

/**
 * @Auther: fan
 * @Date: 2020/12/12
 * @Description: lambda起步
 */
public class StartOfLambda {

    public static void main(String[] args) {
        //1、使用接口实现类
        Comparator comparator = new ComparatorImpl();
        //2、使用匿名内部类
        Comparator comparator1 = new Comparator() {
            @Override
            public int comparator(int a, int b) {
                return a - b;
            }
        };
        //3、使用Lambda表达式来实现接口
        Comparator comparator2 = (a,b) -> a - b;
    }
}

class ComparatorImpl implements Comparator{

    @Override
    public int comparator(int a, int b) {
        return a - b;
    }
}

@FunctionalInterface
interface Comparator{
    int comparator(int a, int b);
//    void show();//加上了之后就会报错，因为这个接口被@FunctionalInterface修饰，只能有一个必须实现的抽象方法
}
