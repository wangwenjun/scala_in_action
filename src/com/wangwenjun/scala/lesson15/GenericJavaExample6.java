package com.wangwenjun.scala.lesson15;

/***************************************
 * @author:Alex Wang <br/>
 * @taobao:http://wangwenjun0609.com
 ***************************************/
public class GenericJavaExample6
{
    static class A
    {

    }

    static class B extends A
    {

    }

    static class C extends B
    {

    }

    static class D extends C
    {

    }

    static class X<T>
    {
        private final T t;

        public X(T t)
        {
            this.t = t;
        }

        public T get()
        {
            return t;
        }

        public static <T> T getT(T t)
        {
            return t;
        }
    }

    static class Y<T extends B>
    {

    }

    static class Z
    {
        public Z(X<? super C> c)
        {

        }
    }
}
