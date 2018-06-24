package com.wangwenjun.scala.lesson10

/** *************************************
  *
  * @author:Alex Wang <br/>
  *              http://wangwenjun0609.taobao.com
  * **************************************/
class ArrayElement(conts: Array[String]) extends Element {

  override val x: String = "ArrayElement"

  override val contents = conts

  val y: String = "ArrayElement-Y"

  def test(): Unit = {
    println("ArrayElement-test")
  }
}
