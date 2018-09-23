package com.wangwenjun.scala.lesson22

/** *************************************
  *
  * @author:Alex Wang <br/>
  * @taobao:http: //wangwenjun0609.taobao.com
  * **************************************/
object Standalone {

  var username: String = "DEFAULT"

  def main(args: Array[String]): Unit = {
    println(username)
    username = "ALEX"
    println(username)
    username = "SCALA"
    println(username)
  }
}
