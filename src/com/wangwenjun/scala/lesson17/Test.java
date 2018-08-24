package com.wangwenjun.scala.lesson17;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/***************************************
 * @author:Alex Wang <br/>
 * @taobao:http://wangwenjun0609.taobao.com
 ***************************************/
public class Test
{
    public static void main(String[] args)
    {
        List<Integer> listI = new ArrayList<>();
        List<String> listS = new ArrayList<>();
        List listO = new ArrayList();
        System.out.println(listI.getClass() == listS.getClass());
        System.out.println(listI.getClass() == listO.getClass());
    }

//    private static List<Integer> toDouble(List<String> list)
//    {
//        return list.stream().map(Integer::parseInt).map(e -> e * 2).collect(Collectors.toList());
//    }
//
//    private static List<Integer> toDouble(List<Integer> list)
//    {
//        return list.stream().map(e -> e * 2).collect(Collectors.toList());
//    }
}
