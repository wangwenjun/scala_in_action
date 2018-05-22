package com.wangwenjun.scala.lesson01
object HelloWorld2 {


  /**
    * def methodName(paramName:paramType):return type(Unit)={
    *
    * }
    *
    * @param args
    */
  def main(args: Array[String]): Unit = {
    //    println("Hello World2")
    /*val i:Int=1
    println(i)*/
    println(max(1, 2))
    println(max2(1, 2))
  }

  def max(x: Int, y: Int): Int = {
    if (x > y) x
    else y
  }

  def max2(x: Int, y: Int) = if (x > y) x else y
}
