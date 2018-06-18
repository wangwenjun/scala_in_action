package com.wangwenjun.scala.lesson09

import java.io.{File, PrintWriter}

/** *************************************
  *
  * @author:Alex Wang <br/>
  *              http://wangwenjun0609.taobao.com
  ***************************************/
object Control extends App {

  def inc(x: Int): Int = {
    val i: Int = x + 1
    i
  }

  println(inc(10))

  def op(o: Int => Int, x: Int): Int = {
    o(x)
  }

  println("======================")
  println(op(i => i + 1, 10))
  println(op(_ + 2, 10))

  println("========================")
  println(10)
  println {
    10
  }


  def test(x: Int): Unit = {
    println {
      x
    }
  }

  println("=========================")
  test(10)
  test {
    10
  }

  println("=========================")

  def writeToFile(file: File, op: PrintWriter => Unit): Unit = {
    val writer: PrintWriter = new PrintWriter(file)
    try {
      op(writer)
      writer.flush()
    } finally {
      writer.close()
    }
  }

  //  writeToFile(new File("1.txt"), (writer: PrintWriter) => writer.write("Hello Scala"))
  writeToFile(new File("1.txt"), _.write("Hello Scala"))


  def writeToFile2(file: File)(op: PrintWriter => Unit): Unit = {
    val writer: PrintWriter = new PrintWriter(file)
    try {
      op(writer)
      writer.flush()
    } finally {
      writer.close()
    }
  }

  writeToFile2 {
    new File("2.txt")
  } {
    _.write("Hello Scala")
  }
}
