package com.wangwenjun.scala.lesson15

/** *************************************
  *
  * @author:Alex Wang <br/>
  * @taobao:http: //wangwenjun0609.com
  ***************************************/
object GenericExample8 extends App {

  abstract class Function[IN, OUT] {
    def apply(in: IN): OUT

    def done(): Boolean
  }

  class FunctionAdapter extends Function[Nothing, Nothing] {
    override def apply(in: Nothing): Nothing = in

    override def done(): Boolean = false
  }

  object FunctionObject extends Function[Nothing, Nothing] {
    override def apply(in: Nothing): Nothing = in

    override def done(): Boolean = false
  }

  trait A

  class B extends A

  object Utils {

    def printList(list: List[_ <: A]): Unit = {
      println(list)
    }
  }

  Utils.printList(List(new B))

}
