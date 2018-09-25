package com.wangwenjun.scala.lesson23

object ExtractorExample1 extends App {

  class Test(val x: Int, val y: Int) {

    override def toString: String = s"$x===$y"

    def +(that: Test) = Test(this.x + that.x, this.y + that.y)
  }

  object Test {

    def apply(x: Int, y: Int): Test = new Test(x, y)

    def unapply(test: Test): Option[(Int, Int)] = Some(test.x, test.y)
  }

  val test: Test = Test(1, 2)
  println(test.x)
  println(test.y)

  val result = Test(1, 1) + Test(2, 2)
  println(result)
  val Test(x, y) = Test(1, 1) + Test(2, 2)
  println(x)
  println(y)
}