package com.wangwenjun.scala.lesson15

/** *************************************
  *
  * @author:Alex Wang <br/>
  * @taobao:http: //wangwenjun0609.com
  ***************************************/
object GenericExample9 extends App {


  class A

  class B extends A

  class C extends B

  class D extends C

  private def foo[T <: B](t: T): Unit = {

  }

  private def fun[T >: C](t: T): Unit = {
    println(t)
  }
}
