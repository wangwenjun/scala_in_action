package com.wangwenjun.scala.lesson17

/** *************************************
  *
  * @author:Alex Wang <br/>
  * @taobao:http: //wangwenjun0609.taobao.com
  * **************************************/
object SeniorTypeExample1 extends App {

  class Outer {
    class Inner {
    }
  }

  //ONGL struts2
  private val outer: Outer = new Outer()
  val inner: Outer#Inner = new outer.Inner()
  println(inner)
}
