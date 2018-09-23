package com.wangwenjun.scala.lesson22;

/***************************************
 * @author:Alex Wang <br/>
 * @taobao:http://wangwenjun0609.taobao.com
 ***************************************/
public class AccessCompanion
{
    public static void main(String[] args)
    {
        Companion companion = new Companion();
        companion.test();
        Companion.testing();//==Companion$.MODULE$.testing()
        Companion$.MODULE$.testing();
        Companion$.MODULE$.test();
    }
}
