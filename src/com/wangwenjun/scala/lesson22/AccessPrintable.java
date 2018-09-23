package com.wangwenjun.scala.lesson22;

public class AccessPrintable
{
    private static class JavaPrintable implements Printable
    {
        @Override
        public void println(String text)
        {
            Printable$class.println(this, text);
        }

        @Override
        public void printHeader()
        {
            System.out.println("########################");
        }

        @Override
        public void printTail()
        {
            System.out.println("########################");
        }

        @Override
        public void print(String text)
        {
            System.out.println("*" + text + "*");
        }
    }

    public static void main(String[] args)
    {
        final Printable printable = new JavaPrintable();
        printable.println("Scala is powerful");
    }
}
