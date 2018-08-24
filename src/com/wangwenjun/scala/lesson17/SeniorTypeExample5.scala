package com.wangwenjun.scala.lesson17

/** *************************************
  *
  * @author:Alex Wang <br/>
  * @taobao:http: //wangwenjun0609.taobao.com
  * **************************************/
object SeniorTypeExample5 extends App {

  //complex type
  type CT = Serializable with Cloneable with AutoCloseable

  val list: List[CT] = List()
  val list2: List[T] = List()

  def fun(x: CT): Unit = {

  }

  trait T extends Serializable with Cloneable with AutoCloseable

  //1.+(2)
  //1::Nil


  val map: Map[String, Int] = Map("Alex" -> 22)
  println(map)

  val map2: String Map Int = Map("Alex" -> 11)
  println(map2)
}
