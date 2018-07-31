package com.wangwenjun.scala.lesson15;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.*;

/***************************************
 * @author:Alex Wang <br/>
 * @taobao:http://wangwenjun0609.com
 ***************************************/
public class GenericJava
{
    public static void main(String[] args)
    {
        Integer[] result = convert(Integer.class, 1, 2);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

    private static <T> T[] convert(Class<T> type, T a, T b)
    {
        Object[] source = Arrays.asList(a, b).toArray(new Object[2]);

        T[] result = (T[]) Array.newInstance(type, 2);

        return Arrays.copyOf(source, 2, (Class<? extends T[]>) result.getClass());
    }

    private interface F extends Serializable, Comparable<F>
    {

    }

    private static <T extends Serializable & Comparable<T>> void test(T t)
    {

    }
}
