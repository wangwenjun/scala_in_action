package com.wangwenjun.scala.lesson02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class JavaNIO2Files
{
    public static void main(String[] args) throws IOException
    {
        List<String> list = Files.readAllLines(Paths.get("C:\\Users\\wangwenjun\\IdeaProjects\\scala_in_action\\src\\com\\wangwenjun\\scala\\lesson02\\FunctionalExample.scala"));
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);

        list.stream().forEach(System.out::println);
    }
}
