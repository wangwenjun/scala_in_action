package com.wangwenjun.scala.lesson22

/** *************************************
  *
  * @author:Alex Wang <br/>
  * @taobao:http: //wangwenjun0609.taobao.com
  ***************************************/
class Companion {

  def test(): Unit = {
    println("======class ====test")
  }
}

object Companion {
  def test(): Unit = {
    println("======object ====test")
  }

  def testing(): Unit = {
    println("======object ====testing")
  }
}