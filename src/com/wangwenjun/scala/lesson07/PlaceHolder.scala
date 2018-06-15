package com.wangwenjun.scala.lesson07

/** *************************************
  *
  * @author:Alex Wang <br/>
  *              http://wangwenjun0609.taobao.com
  * **************************************/
object PlaceHolder extends App {

  private var x: Int = _
  println(x)

  val r: Range.Inclusive = 0 to 10
  r.filter((p: Int) => p > 5).map(p => "x" * p).foreach(p => println(p))

  println("========================")
  r.filter(_ > 5).map("x" * _).foreach(println _)


  def fun(x: Int): Int = {
    x * 10
  }

  def fun2(x: Int, y: Int): Int = {
    x * 10 + y / 2
  }

  val f1: Int => Int = fun _
  val f2: (Int, Int) => Int = fun2(_, _)
  val f3: (Int, Int) => Int = fun2 _
  println(f1(10))
  println(f2(10, 4))
  println(f3(10, 4))

  val f4: (Int, Int) => Int = (x: Int, y: Int) => x + y
  val f5: (Int, Int) => Int = (_: Int) + (_: Int)

  println(f4(2, 3))
  println(f5(2, 3))

}
