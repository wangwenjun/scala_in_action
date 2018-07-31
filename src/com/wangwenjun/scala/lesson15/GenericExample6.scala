package com.wangwenjun.scala.lesson15

/** *************************************
  *
  * @author:Alex Wang <br/>
  * @taobao:http: //wangwenjun0609.com
  * **************************************/
object GenericExample6 extends App {

  class Animal

  class Human extends Animal

  class Student extends Human

  class X[+T](val t: T)

  class Y[-T](t: T)

  private[this] def fun1(x: X[Animal]): Unit = {
    println(x)
  }

  private[this] def fun2(y: Y[Human]): Unit = {
    println(y)
  }

  fun1(new X[Animal](new Animal))
  fun1(new X[Human](new Human))

  fun2(new Y[Human](new Human))
  fun2(new Y[Animal](new Animal))
  //  fun2(new Y[Student](new Student))


}
