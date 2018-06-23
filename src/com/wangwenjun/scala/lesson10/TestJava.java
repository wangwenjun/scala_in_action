package com.wangwenjun.scala.lesson10;

/***************************************
 * @author:Alex Wang <br/>
 * http://wangwenjun0609.taobao.com
 ***************************************/
public class TestJava
{
    private static int x = 10;

    private static int x()
    {
        return 10;
    }

    public static void main(String[] args)
    {

    }

    static class A
    {
        public A(String x, int y)
        {

        }
    }

    static class B extends A
    {

        public B()
        {
            super("x", 10);
        }
    }
}
