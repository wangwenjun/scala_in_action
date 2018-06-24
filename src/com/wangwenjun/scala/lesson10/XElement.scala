package com.wangwenjun.scala.lesson10

/** *************************************
  *
  * @author:Alex Wang <br/>
  *              http://wangwenjun0609.taobao.com
  ***************************************/
class XElement(array: Array[String], override val height: Int, override val width: Int) extends Element {
  override val x = "XElement"

  override def contents() = {
    array
  }
}
