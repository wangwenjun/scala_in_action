package com.wangwenjun.scala.lesson07;

/***************************************
 * @author:Alex Wang <br/>
 * http://wangwenjun0609.taobao.com
 ***************************************/
public class VarParameterJava
{
    public static void main(String[] args)
    {
//        print("hello", "world");
        print(new String[]{"Hello", "sdfs"});
    }

    private static void print(String... args)
    {
        for (String str : args)
        {
            System.out.println(str);
        }
    }
}
