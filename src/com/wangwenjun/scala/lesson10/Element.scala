package com.wangwenjun.scala.lesson10

/** *************************************
  *
  * @author:Alex Wang <br/>
  *              http://wangwenjun0609.taobao.com
  ***************************************/
/**
  * If the class contains abstract property or abstract function, The class must declear to abstract
  *
  * If the class is abstract class, this class can not contains abstract property| function
  */
abstract class Element {

  val x: String

  def contents(): Array[String]

  def height: Int = {
    println("====================")
    contents().length
  }

  def width: Int = if (height == 0) 0 else contents().map(_.length).max

}
