package com.wangwenjun.scala.lesson06

/** *************************************
  *
  * @author:Alex Wang <br/>
  *              http://wangwenjun0609.taobao.com
  ***************************************/
object MATCH extends App {

  val x: Int = 10
  val result: String = x match {
    case 1 => {
      println("i am one")
      "one"
    }
    case 5 => {
      println("i am five")
      "five"
    }
    case 10 => {
      println("i am ten")
      "ten"
    }
    case _ => {
      println("i am invalid")
      "invalid"
    }
  }

  println(result)
}
