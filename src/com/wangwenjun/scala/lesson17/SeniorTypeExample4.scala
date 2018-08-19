package com.wangwenjun.scala.lesson17

import scala.collection.mutable.ListBuffer

/** *************************************
  *
  * @author:Alex Wang <br/>
  * @taobao:http: //wangwenjun0609.taobao.com
  * **************************************/
object SeniorTypeExample4 extends App {

  def appendLines(foo: {def append(source: String): Unit}, lines: List[String]): Unit = {
    for (l <- lines) {
      foo.append(l)
    }
  }

  class Test {
    type L = scala.collection.mutable.ListBuffer[String]
    private val target: L = ListBuffer()

    def append(source: String): Unit = {
      target += source
    }

    def getResult(): L = target
  }

  val t = new Test
  appendLines(t, List("Scala", "Kafka", "Akka", "Spark", "Actor"))
  println(t.getResult())


  appendLines(new {
    private[this] def log(str: String): Unit = {
      println(str)
    }

    def append(source: String): Unit = {
      log(source)
    }
  }, List("Scala", "Kafka", "Akka", "Spark", "Actor"))
}
