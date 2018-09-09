package com.wangwenjun.scala.lesson18

/** *************************************
  *
  * @author:Alex Wang <br/>
  * @taobao:http: //wangwenjun0609.taobao.com
  * **************************************/
object StreamExample extends App {
  val s1: Stream[Int] = 2 #:: 3 #:: 4 #:: Stream.empty[Int]
  println(s1)

  def toDouble(x: Int): Int = {
    println(s"make the $x to double.")
    x * 2
  }

  val s2 = s1.map(toDouble)
  println(s1)
  println(s2)
  s2.print()

  val s3 = (1 to 10).toStream

  println("=============================")
  val s4 = s3.map(toDouble).take(5).force

  println(s4)

  def fromNum(n: Int): Stream[Int] = n #:: fromNum(n + 1)

  val s5 = fromNum(2)
  println(s5)

  val s6 = s5.map(toDouble).take(10)
  println(s6)
  s6.foreach(println)
}
