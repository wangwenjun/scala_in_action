package com.wangwenjun.scala.lesson10

/** *************************************
  *
  * @author:Alex Wang <br/>
  *              http://wangwenjun0609.taobao.com
  ***************************************/
object ElementApp extends App {

  //  val ae: Element = new ArrayElement(Array("Hello", "Scala"))
  //  println(ae.contents())
  //  println(ae.width)
  //  println(ae.height)

  val xe: Element = new XElement(Array("Hello", "Scala"), 10, 3)
  println(xe.height)

  def ele(e: Element): Unit = {
    println(e.height)
  }
}
