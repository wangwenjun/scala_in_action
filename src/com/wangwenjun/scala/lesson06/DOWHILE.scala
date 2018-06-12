package com.wangwenjun.scala.lesson06

/** *************************************
  *
  * @author:Alex Wang <br/>
  *              http://wangwenjun0609.taobao.com
  ***************************************/
object DOWHILE extends App {

  var total: Int = _
  var i: Int = _
  val result = do {
    i += 1
    total += i
  } while (i < 10)

  println(total)
  println(result)
  println(() == result)

  def hello(): Unit = {

  }
}
