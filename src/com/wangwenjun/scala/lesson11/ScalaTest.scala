package com.wangwenjun.scala.lesson11

/** *************************************
  *
  * @author:Alex Wang <br/>
  *              http://wangwenjun0609.taobao.com
  ***************************************/
object ScalaTest extends App {

  private val scala1 = new Test("Scala")
  private val scala2 = new Test("Scala")

  println(scala1.equals(scala2))
  println(scala1.==(scala2))

  val x: Int = 10
  val y: Int = 10
  println(x == y)

  val alex: Test = scala2
  println(alex)

  private val value: AnyVal = exception()
  println(value)

  def exception(): Int = {
    if (alex == null) {
      throw new RuntimeException
    }
    else {
      10
    }
  }
}
