package com.wangwenjun.scala.lesson12;

import scala.actors.threadpool.Arrays;

import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.toList;

/***************************************
 * @author:Alex Wang <br/>
 * http://wangwenjun0609.taobao.com
 ***************************************/
public class JDK8
{
    public static void main(String[] args)
    {
        List<String> list = Arrays.asList(new String[]{"AB5", "XY1", "ER2"});
        List<Character> result = list.stream().map(s -> s.substring(2).charAt(0)).distinct().collect(toList());
        result.forEach(System.out::println);
    }

}

interface Service
{
    List<String> list();

    default List<String> findByName()
    {
        return Collections.emptyList();
    }
}

class MyService implements Service
{

    @Override
    public List<String> list()
    {
        return Arrays.asList(new String[]{"Hello", "Scala"});
    }
}

interface A
{

    default void test()
    {
        System.out.println("=======A=========");
    }
}

interface B
{
    default void test()
    {
        System.out.println("=======B=========");
    }
}

class AB implements A, B
{
    @Override
    public void test()
    {

    }
}
