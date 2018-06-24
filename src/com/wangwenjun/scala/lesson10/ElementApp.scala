package com.wangwenjun.scala.lesson10

/** *************************************
  *
  * @author:Alex Wang <br/>
  *              http://wangwenjun0609.taobao.com
  * **************************************/
/**
  * obj.asInstanceOf[C] <=> (C)obj
  * classOf[C]  <=>C.class
  * obj.isInstanceOf[C] <=> obj  instanceof C
  */
object ElementApp extends App {
  val ae: Element = new ArrayElement(Array("Hello", "Scala"))
  println(ae.contents())
  println(ae.width)
  println(ae.height)

  val xe: Element = new XElement(Array("Hello", "Scala"), 10, 3)
  println(xe.height)

  cast(xe)

  def cast(e: Element): Unit = {
    e match {
      case element: ArrayElement => element.asInstanceOf[ArrayElement].test()
      case element: XElement =>
      case _ =>
    }
  }

  private val element: Element = new Element {
    override def contents(): Array[String] = Array()

    override val x: String = "Element"
  }

  printElement(element)

  def printElement(e: Element): Unit = {
    println(e.x)
    println(e.contents())
  }
}