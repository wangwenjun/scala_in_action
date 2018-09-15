package com.wangwenjun.scala.lesson19

import java.io.IOException

import scala.annotation.{tailrec, varargs}

/** *************************************
  *
  * @author:Alex Wang <br/>
  * @taobao:http: //wangwenjun0609.taobao.com
  ***************************************/
object AnnotationExample extends App {

  @volatile var x: Int = 10

  def accumulate(x: Int): Int = {
    @tailrec def acc(a: Int, x: Int): Int = {
      if (x <= 0) a
      else acc(a + x, x - 1)
    }

    acc(0, x)
  }

  @throws(classOf[IOException])
  def thr(): Unit = {
    throw new IOException()
  }

  @varargs def varPar(s: String*): Unit = {

  }

  @Alex def test(): Unit = {

  }
}
