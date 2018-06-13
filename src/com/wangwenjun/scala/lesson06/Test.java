package com.wangwenjun.scala.lesson06;

/***************************************
 * @author:Alex Wang <br/>
 * http://wangwenjun0609.taobao.com
 ***************************************/
public class Test
{
    public static void main(String[] args)
    {
        System.out.println(test());
    }

    private static int test()
    {
        try
        {
            return 1;
        } finally
        {
            return 10;
        }
    }
}
