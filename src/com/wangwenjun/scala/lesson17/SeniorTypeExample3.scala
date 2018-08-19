package com.wangwenjun.scala.lesson17

/** *************************************
  *
  * @author:Alex Wang <br/>
  * @taobao:http: //wangwenjun0609.taobao.com
  * **************************************/
object SeniorTypeExample3 extends App {

  import scala.collection.mutable.HashMap

  type M = HashMap[String, Int]
  type N = HashMap[Int, String]

  val x: M = HashMap("Alex" -> 100)
  val y: N = HashMap(100 -> "Alex")

  println(x)
  println(y)

  import java.util.{HashMap => JavaHashMap}
  val jHM: JavaHashMap[String, String] = new JavaHashMap[String, String]()

}
