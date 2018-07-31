package com.wangwenjun.scala.lesson15;

/***************************************
 * @author:Alex Wang <br/>
 * @taobao:http://wangwenjun0609.com
 ***************************************/
public class GenericJavaExample4
{

    public static void main(String[] args)
    {
        B b = new B();


    }


    private static class A
    {

        public void test(String x)
        {
            System.out.println("A" + x);
        }

        public void test3(CharSequence x)
        {
            System.out.println(x);
        }

        public CharSequence test2()
        {
            System.out.println("AAAAAAAAAAAAA");
            return "A-test2";
        }
    }

    private static class B extends A
    {
        public void test(CharSequence x)
        {
            System.out.println("B" + x);
        }

        public void test3(String x)
        {
            System.out.println(x);
        }

        @Override
        public String test2()
        {
            System.out.println("BBBBBBBBBBBBBBB");
            return "B-test2";
        }
    }
}
