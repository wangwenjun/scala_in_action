package com.wangwenjun.scala.lesson13


/** *************************************
  *
  * @author:Alex Wang <br/>
  *              http://wangwenjun0609.taobao.com
  ***************************************/
object PackageExample extends App {
  {
    import com.wangwenjun.scala.lesson13.test.{Fruits => F}
    import F.{Test => T, _}

    println(Apple.name)
    println(Orange.name)
    println(Banana.name)
    println(Peach.name)
    listFruit()

    val test: T = new T("TEST", "Unknown")
    println(test.name)
    println(test.color)
  }
  {
    import com.wangwenjun.scala.lesson13.test.Fruits.{Apple => _, _}
    println(Orange.name)
    println(Banana.name)
    println(Peach.name)
    listFruit()
  }

  println("")
  Array()
  val i:Int=10
  val s:String=""
}

package test {

  abstract class Fruit(val name: String, val color: String)

  object Fruits {

    object Orange extends Fruit("Orange", "YELLOW")

    object Apple extends Fruit("Apple", "RED")

    object Banana extends Fruit("Banana", "GREEN")

    object Peach extends Fruit("Peach", "PINK")

    class Test(name: String, color: String) extends Fruit(name, color)

    def listFruit(): List[Fruit] = {
      List(Orange, Apple, Banana, Peach)
    }
  }

}
