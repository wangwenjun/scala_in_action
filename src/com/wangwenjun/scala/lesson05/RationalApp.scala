package com.wangwenjun.scala.lesson05

/** *************************************
  *
  * @author:Alex Wang <br/>
  *              http://wangwenjun0609.taobao.com
  ***************************************/
object RationalApp extends App {

  val r1: Rational = new Rational(1, 2)
  println(r1)

  val r2: Rational = new Rational(3, 2)
  println(r2)

  val r3: Rational = r1.add(r2)
  println(r3)

  println(new Rational())
  println(new Rational(10))
  println(r1.lessThan(r2))
  println(r1.max(r2))
  println(new Rational(6, 3))
  println(new Rational(3, 6))

  println(r1 + r2)
  println(r1.+(r2))
  //  val x:Int = 1
  //  val y:Int = 2
  //  println(x+y)
  //  println(x.+(y))


  println(r1 - r2)
  println(r1.subtract(r2))

  println(r1 + 1)

  implicit def intToRational(x: Int) = new Rational(x)

  println(1 + r1)

}
