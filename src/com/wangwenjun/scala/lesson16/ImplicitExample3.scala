package com.wangwenjun.scala.lesson16

/** *************************************
  *
  * @author:Alex Wang <br/>
  * @taobao:http: //wangwenjun0609.taobao.com
  * **************************************/
object ImplicitExample3 {

  class A

  class B(a: A)

  def main(args: Array[String]): Unit = {
    val d: Double = 10.0d
    val i: Int = d
    println(i)
    println("================")

    test(new B(new A))

    test(new A)

    val c: Char = 'c'
    println(c)

    println("10" / 3)
  }

  implicit def sToI(s: String): Int = {
    Integer.parseInt(s)
  }
//
//  implicit def sToD(s: String): Double = {
//    java.lang.Double.parseDouble(s)
//  }

  implicit def dToI(d: Double): Int = {
    d.toInt
  }

  implicit def aToB(a: A): B = new B(a)

  private[this] def test(b: B): Unit = {
    println(b)
  }
}
