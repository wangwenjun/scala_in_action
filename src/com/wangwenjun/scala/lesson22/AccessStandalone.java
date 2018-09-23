package com.wangwenjun.scala.lesson22;

/***************************************
 * @author:Alex Wang <br/>
 * @taobao:http://wangwenjun0609.taobao.com
 ***************************************/
public class AccessStandalone
{
    public static void main(String[] args)
    {
        System.out.println(Standalone.username());
        Standalone.username_$eq("ALEX");
        System.out.println(Standalone.username());
        Standalone.username_$eq("SCALA");
        System.out.println(Standalone.username());
    }
}
