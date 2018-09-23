package com.wangwenjun.scala.lesson22;

/***************************************
 * @author:Alex Wang <br/>
 * @taobao:http://wangwenjun0609.taobao.com
 ***************************************/
public class AccessScalaClass
{
    public static void main(String[] args)
    {
        ScalaClass scala = new ScalaClass(10, 10.5);
        System.out.println(scala.x());
        System.out.println(scala.y());
    }
}
