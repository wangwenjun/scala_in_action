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
        A a = new B(new String[]{"sdfs"});
        System.out.println(a.size);


    }

    static class A
    {
        public A(String x, int y)
        {

        }

        private String[] args;

        public int size = args.length;

        public A(String[] args)
        {
            this.args = args;
        }

        int x = 10;

        public void test()
        {

        }
    }

    static class B extends A
    {
        public B(int x)
        {
            super("x", 10);
            this.x = 100;
        }

        public B(String[] args)
        {
            super(args);
        }

        @Override
        public void test()
        {

        }
    }
}
