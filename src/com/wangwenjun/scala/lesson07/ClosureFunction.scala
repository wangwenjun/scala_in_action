package com.wangwenjun.scala.lesson07

/** *************************************
  *
  * @author:Alex Wang <br/>
  *              http://wangwenjun0609.taobao.com
  ***************************************/
object ClosureFunction extends App {

  def test(): () => Unit = {
    var i: Int = 0
    () => {
      i += 1
      println(i)
    }
  }

  val fun: () => Unit = test()

  fun()
  fun()
  fun()
  fun()
}
