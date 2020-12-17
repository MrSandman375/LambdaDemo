package com.renjie.lambdademo.lambdaStudy.function;

/**
 * @Auther: fan
 * @Date: 2020/12/14
 * @Description: 系统内置的一些函数式接口
 */
public class FunctionalInterface {
    public static void main(String[] args) {

        // Predicate<T>         ：   参数T         返回值boolean
            // IntPredicate         ：   参数int       返回值boolean
            // LongPredicate        ：   参数long      返回值boolean
            // DoublePredicate      ：   参数double    返回值boolean
        // Consumer<T>          ：   参数T         返回值void
            // IntConsumer          ：   参数int       返回值void
            // LongConsumer         ：   参数long      返回值void
            // DoubleConsumer       ：   参数double    返回值void
        // Function<T,R>        ：   参数T         返回值R
            // IntFunction<R>       ：   参数int       返回值R
            // LongFunction<R>      ：   参数long      返回值R
            // DoubleFunction<R>    ：   参数double    返回值R
            // IntToLongFunction    ：   参数int       返回值long
            // IntToDoubleFunction  ：   参数int       返回值double
            // LongToIntFunction    ：   参数long      返回值int
            // LongToDoubleFunction ：   参数long      返回值double
            // DoubleToIntFunction  ：   参数Double    返回值int
            // DoubleToLongFunction ：   参数Double    返回值long
        // Supplier<T>          ：   参数无        返回值T
            // IntSupplier          ：   参数无        返回值int
            // LongSupplier         ：   参数无        返回值long
            // DoubleSupplier       ：   参数无        返回值double
        // UnaryOperator<T>     ：   参数T         返回值T
        // BinaryOperator<T>    ：   参数T,T       返回值T
        // BiFunction<T,U,R>    ：   参数T,U       返回值R
        // BiPredicate<T,U>     ：   参数T,U       返回值boolean
        // BiConsumer<T,U>      ：   参数T,U       返回值无

        //开发中常用的：Predicate<T>，Consumer<T>，Function<T,R>，Supplier<T>
    }
}
