package com.wangwenjun.scala.lesson17

/** *************************************
  *
  * @author:Alex Wang <br/>
  * @taobao:http: //wangwenjun0609.taobao.com
  ***************************************/
object SeniorTypeExample7 extends App {

  class A {
    //self is the alias of this reference
    //self is not the key words.
    //Note: the alias naming should not use this key words
    self =>
    val x: Int = 10

    def test(): Int = {
      println(this == self)
      this.x + self.x
    }
  }

  println(new A test())

  class Outer {
    outer =>
    val x: Int = 10

    class Inner {
      val x: Int = 20

      def test(): Unit = println(outer.x)
    }
  }

  val outer: Outer = new Outer
  val inner: Outer#Inner = new outer.Inner
  inner.test()
}
