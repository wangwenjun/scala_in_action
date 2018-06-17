package com.wangwenjun.scala.lesson07

/** *************************************
  *
  * @author:Alex Wang <br/>
  *              http://wangwenjun0609.taobao.com
  * **************************************/
object HighOrderFunction extends App {


  val add: (Int, Int) => Int = (x: Int, y: Int) => x + y

  def cal(op: (Int, Int) => Int, x: Int, y: Int): Int = {
    op.apply(x, y)
  }

  println(cal(add, 1, 2))

  def handle(): (Int) => Int = {
    (x: Int) => x * 10
  }

  println(handle()(10))
}
