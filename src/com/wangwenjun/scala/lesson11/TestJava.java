package com.wangwenjun.scala.lesson11;

/***************************************
 * @author:Alex Wang <br/>
 * http://wangwenjun0609.taobao.com
 ***************************************/
public class TestJava
{
    public static void main(String[] args)
    {

        Test alex1 = new Test("Alex");
        Test alex2 = new Test("Alex");

        System.out.println(alex1.equals(alex2));
        System.out.println(alex1 == alex2);
    }

    private static class Test
    {
        private final String name;

        private Test(String name)
        {
            this.name = name;
        }

        public String getName()
        {
            return name;
        }

        @Override
        public boolean equals(Object obj)
        {
            return this.name.equals(((Test) obj).getName());
        }
    }
}
