package com.wangwenjun.scala.lesson09

/** *************************************
  *
  * @author:Alex Wang <br/>
  *              http://wangwenjun0609.taobao.com
  ***************************************/
object Currying extends App {

  def test(x: Int, y: Int): Int = {
    x + y
  }

  println(test(1, 2))

  val test1: Int => Int = test(10, _: Int)
  println(test1(100))

  def test2(x: Int)(y: Int)(z: Int): Int = {
    x + y + z
  }

  println(test2(10)(100)(0))

  def fun(x: Int): Int => Int = {
    (y: Int) => x + y
  }

  println(fun(10)(100))

  val fun1: Int => Int = fun(10)
  val fun2: Int => Int = fun(10)

}
