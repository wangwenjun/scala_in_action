package com.wangwenjun.scala.lesson22;

public class AccessDefaultArgumentsFunction
{
    public static void main(String[] args)
    {
        DefaultArgumentsFunction fun = new DefaultArgumentsFunction();
        System.out.println(fun.add(1, 2, 3));
        System.out.println(fun.add(1, fun.add$default$2(), 3));
    }
}
