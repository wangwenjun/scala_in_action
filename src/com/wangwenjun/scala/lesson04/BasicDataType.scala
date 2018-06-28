package com.wangwenjun.scala.lesson04

/** *************************************
  *
  * @author:Alex Wang <br/>
  *              http://wangwenjun0609.taobao.com
  * **************************************/
object BasicDataType extends App {

  val i: Int = 10
  val j: Int = 10
  println(i + j)
  println(i.+(j))

  println(i.max(20))

  println(-i)
  println(i.unary_-)

  val range: Range = 1 to 10

  range.foreach(println _)
}
