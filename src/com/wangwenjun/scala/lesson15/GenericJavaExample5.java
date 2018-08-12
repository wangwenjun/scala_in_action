package com.wangwenjun.scala.lesson15;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/***************************************
 * @author:Alex Wang <br/>
 * @taobao:http://wangwenjun0609.com
 ***************************************/
public class GenericJavaExample5
{
    private static class A
    {

    }

    private static class B extends A
    {

    }

    //PECS=> producer extends consumer super
    public static void main(String[] args)
    {
        List<B> bList = new ArrayList<>();
        List<? extends A> aList = bList;

        printList1(Arrays.asList(new A()));
        printList1(Arrays.asList(new B()));

        List<A> aList1 = new ArrayList<>();
        List<? super B> bList1 = aList1;

        bList1.add(new B());

        printList2(Arrays.asList(new A()));
        printList2(Arrays.asList(new B()));

    }

    private static void printList1(List<? extends A> aList)
    {
        for (A a : aList)
        {
            System.out.println(a);
        }
    }

    private static void printList2(List<? super B> aList)
    {
        aList.add(new B());
    }

}
