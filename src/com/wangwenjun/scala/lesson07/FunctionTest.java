package com.wangwenjun.scala.lesson07;

import java.util.function.Consumer;

/***************************************
 * @author:Alex Wang <br/>
 * http://wangwenjun0609.taobao.com
 ***************************************/
public class FunctionTest
{
    public static void main(String[] args)
    {
        F foo = () -> System.out.println("hello");

        test(System.out::println, "Alex Java");
    }

    static void test(Consumer<String> fun, String s)
    {
        fun.accept(s);
    }
}

@FunctionalInterface
interface F
{
    void test();
}

