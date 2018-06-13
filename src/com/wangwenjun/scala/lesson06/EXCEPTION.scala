package com.wangwenjun.scala.lesson06

/** *************************************
  *
  * @author:Alex Wang <br/>
  *              http://wangwenjun0609.taobao.com
  * **************************************/
object EXCEPTION extends App {


  val result: Int = try {
    testThrow(10)
  } catch {
    case e: RuntimeException => {
      -1
    }
    case e: Exception => -2
  }

  println(result)

  def testThrow(x: Int): Int = {
    if (x == 1) {
      x + 10
    }
    else
      throw new Exception("the parameter is invalid.")
  }


  def fun(): Int = {
    var result: Int = 0
    try {
      result = 1
    } finally {
      result
    }
    result
  }

  println("==============")
  println(fun)
}
