package com.wangwenjun.scala.lesson22;

import scala.Function1;

public class AccessLiteralFunction
{
    public static void main(String[] args)
    {
        System.out.println(LiteralFunction.fun().apply("Scala"));
        Function1<String, String> fun = LiteralFunction.fun();
        System.out.println(fun.apply("Scala"));
    }
}
