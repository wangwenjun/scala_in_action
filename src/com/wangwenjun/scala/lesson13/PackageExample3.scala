package com.wangwenjun.scala.lesson13

import com.wangwenjun.scala.lesson13.pkg2.Test


/** *************************************
  *
  * @author:Alex Wang <br/>
  *              http://wangwenjun0609.taobao.com
  * **************************************/
object PackageExample3 extends App {

  import com.wangwenjun.scala.lesson13.pkg._

  fruits.foreach(gracefulPrint)

  new Test().test()
}

package pkg {

  abstract class Fruit(val name: String, val color: String)

  object Fruits {

    object Orange extends Fruit("Orange", "YELLOW")

    object Apple extends Fruit("Apple", "RED")

    object Banana extends Fruit("Banana", "GREEN")

    object Peach extends Fruit("Peach", "PINK")

  }

}


package pkg2 {

  class Test {
    def test(): Unit = {
      import com.wangwenjun.scala.lesson13.pkg._
      println(fruits)
      pkg.gracefulPrint(Fruits.Apple)
    }
  }

}

package object pkg {
  val fruits: List[Fruit] = List(Fruits.Apple, Fruits.Orange, Fruits.Banana, Fruits.Peach)

  def gracefulPrint(f: Fruit): Unit = {
    println(s"Name: ${f.name} and color: ${f.color}")
  }
}