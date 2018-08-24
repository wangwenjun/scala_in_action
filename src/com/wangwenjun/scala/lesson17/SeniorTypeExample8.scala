package com.wangwenjun.scala.lesson17

/** *************************************
  *
  * @author:Alex Wang <br/>
  * @taobao:http: //wangwenjun0609.taobao.com
  ***************************************/
object SeniorTypeExample8 extends App {

  trait T {
    def add(x: Int, y: Int): Int
  }

  class C {
    self: T =>
    val factor: Int = 2

    override def add(x: Int, y: Int): Int = x * 10 + y
  }

  class D extends C with T {

  }

  object O extends C with T {

  }

  println(new C with T add(10, 1))
  println(new D add(5, 100))
  println(O.add(3, 5))
}
