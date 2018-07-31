package com.wangwenjun.scala.lesson15;

import java.util.ArrayList;
import java.util.List;

/***************************************
 * @author:Alex Wang <br/>
 * @taobao:http://wangwenjun0609.com
 ***************************************/
public class GenericJavaExample2
{

    public static void main(String[] args)
    {
        new UG<Student>();
        new UG<Human>();
//        new UG<Animal>();

        new DG(new X<Animal>());
        new DG(new X<Human>());
//        new DG(new X<Student>());
//        new DG(new X<Object>()); //correct

        List<? extends Animal> list = new ArrayList<Human>();

    }

    private static class X<T>
    {
    }

    private static class DG
    {
        /**
         * A>:T
         *
         * @param x
         */
        DG(X<? super Human> x)
        {

        }
    }

    /**
     * T<:A
     *
     * @param <T>
     */
    private static class UG<T extends Human>
    {
    }

    private static class Animal
    {
    }

    private static class Human extends Animal
    {
    }

    private static class Student extends Human
    {
    }
}