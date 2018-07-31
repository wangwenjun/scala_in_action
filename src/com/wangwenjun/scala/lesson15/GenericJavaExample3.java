package com.wangwenjun.scala.lesson15;

import java.util.ArrayList;
import java.util.List;

/***************************************
 * @author:Alex Wang <br/>
 * @taobao:http://wangwenjun0609.com
 ***************************************/
public class GenericJavaExample3
{
    public static void main(String[] args)
    {
        ArrayList<A> list = new ArrayList<>();
        println(list);
    }

    private static class A
    {

    }

    private static class B extends A
    {

    }

    private static class C extends B
    {

    }

    private static void println(List<? super B> list)
    {
        System.out.println(list);
    }
}
