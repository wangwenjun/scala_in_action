package com.wangwenjun.scala.lesson08

/** *************************************
  *
  * @author:Alex Wang <br/>
  *              http://wangwenjun0609.taobao.com
  * **************************************/
object ListExample extends App {

  val list: List[String] = List[String]("Hello", "world")
  println(list)
  val list2 = list.updated(0, "Alex")
  println(list2)

  println(list.::("Scala"))
  println(list)

  "Scala" :: list
  Nil
  List()
  List.empty[String]

}
