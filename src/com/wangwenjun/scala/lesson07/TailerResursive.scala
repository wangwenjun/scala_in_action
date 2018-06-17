package com.wangwenjun.scala.lesson07

import scala.annotation.tailrec

/** *************************************
  *
  * @author:Alex Wang <br/>
  *              http://wangwenjun0609.taobao.com
  * **************************************/
object TailerResursive extends App {

  def accumulate(x: Int): Int = {
    if (x == 0) x
    else x + accumulate(x - 1)
  }

  println(accumulate2(1000000))

  def accumulate2(x: Int): Int = {
    @tailrec def acc(a: Int, x: Int): Int = {
      if (x <= 0) a
      else acc(a + x, x - 1)
    }

    acc(0, x)
  }
}