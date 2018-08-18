package com.wangwenjun.scala.lesson16;

import java.awt.*;
import java.io.IOException;

/***************************************
 * @author:Alex Wang <br/>
 * @taobao:http://wangwenjun0609.com
 ***************************************/
public class JavaLambda
{
    public static void main(String[] args) throws IOException
    {
        new Thread(() -> System.out.println("=======")).start();
        Button button = new Button("Test");
        button.addActionListener(e -> System.out.println(e.getActionCommand()));
    }
}
