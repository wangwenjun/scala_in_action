package com.wangwenjun.scala.lesson06

/** *************************************
  *
  * @author:Alex Wang <br/>
  *              http://wangwenjun0609.taobao.com
  ***************************************/
object WHILE extends App {

  var total: Int = 0
  var i: Int = 0
  val result = while (i <= 10) {
    total += i
    i += 1
  }

  println(total)
  println(result)
  println(hello()==result)

  def hello(): Unit = {

  }
}
