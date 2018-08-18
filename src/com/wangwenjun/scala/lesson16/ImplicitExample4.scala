package com.wangwenjun.scala.lesson16

/** *************************************
  *
  * @author:Alex Wang <br/>
  * @taobao:http: //wangwenjun0609.taobao.com
  ***************************************/
object ImplicitExample4 extends App {

  import com.wangwenjun.scala.lesson16.ImplicitUtil._

  def quote(text: String)(implicit delimiters: Delimiters): String = {
    delimiters.left + text + delimiters.right
  }

  println(quote("Alex"))
  /*
  def test(x: Int)(y: Int): Int = x + y

  println(test(1)(2))

  val f1: Int => Int = test(10)
  println(f1(10))
  */


}
