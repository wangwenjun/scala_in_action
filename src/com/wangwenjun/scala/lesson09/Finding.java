package com.wangwenjun.scala.lesson09;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/***************************************
 * @author:Alex Wang <br/>
 * http://wangwenjun0609.taobao.com
 ***************************************/
public class Finding
{

    public static void main(String[] args)
    {

        List<String> result = find("C:\\Users\\wangwenjun\\IdeaProjects\\scala_in_action\\src\\com\\wangwenjun\\scala\\lesson09", ".java"
                , String::endsWith);
        System.out.println(result);

    }

    public static List<String> find(String dir, String exp, Matcher matcher)
    {
        String[] list = new File(dir).list();
        List<String> result = new ArrayList<>();
        for (String file : list)
        {
            if (matcher.match(file, exp))
            {
                result.add(file);
            }
        }
        return result;
    }
}

interface Matcher
{
    boolean match(String fileName, String exp);
}