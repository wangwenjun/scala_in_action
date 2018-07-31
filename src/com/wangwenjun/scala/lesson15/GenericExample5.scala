package com.wangwenjun.scala.lesson15

/** *************************************
  *
  * @author:Alex Wang <br/>
  * @taobao:http: //wangwenjun0609.com
  * **************************************/
object GenericExample5 extends App {


  class Animal

  class Human extends Animal

  class Man extends Human

  /**
    * @param t
    * @tparam T
    */
  class Generic[+T](val t: T)

  def test(g: Generic[Animal]): Unit = {
    println(g)
  }

  test(new Generic[Animal](new Animal()))

  test(new Generic[Man](new Man))

  val g: Generic[Animal] = new Generic[Man](new Man)
}
