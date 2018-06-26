package com.wangwenjun.scala.lesson12;

import scala.actors.threadpool.Arrays;

import java.util.Collections;
import java.util.List;

/***************************************
 * @author:Alex Wang <br/>
 * http://wangwenjun0609.taobao.com
 ***************************************/
public class JDK8
{


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
