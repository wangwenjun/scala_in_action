package com.wangwenjun.scala.lesson15

/** *************************************
  *
  * @author:Alex Wang <br/>
  * @taobao:http: //wangwenjun0609.com
  ***************************************/
object GenericExample3 extends App {

  def makeArray[T: Manifest](a: T, b: T): Array[T] = {
    val array: Array[T] = new Array[T](2)
    array(0) = a
    array(1) = b
    array
  }

  val ints: Array[Int] = makeArray(1, 2)
  ints.foreach(println)
}
