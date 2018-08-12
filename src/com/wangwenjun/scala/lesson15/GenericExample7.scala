package com.wangwenjun.scala.lesson15

/** *************************************
  *
  * @author:Alex Wang <br/>
  * @taobao:http: //wangwenjun0609.com
  ***************************************/
object GenericExample7 extends App {

  class Person[+T](t: T) {
    println(t)

    def test(): Unit = {
      println(t)
    }

    def fun(): T = {
      null.asInstanceOf[T]
    }
  }

  class Student[-T](t: T) {

    def fun(): Unit = {
      println(t)
    }
  }

  new Person[String]("Alex").test()
}
