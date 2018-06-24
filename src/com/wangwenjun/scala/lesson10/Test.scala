package com.wangwenjun.scala.lesson10

/** *************************************
  *
  * @author:Alex Wang <br/>
  *              http://wangwenjun0609.taobao.com
  * **************************************/
object Test extends App {

  def x(): String = {
    println("xxxxxxxxxxxxxxxxxxxx")
    "x"
  }

  val y: String = x

  println(y)
  println(y)
  println(y)
  println(y)

  def a(i: Int): String = "a"

  val a: String = "a"


  class A(x: Int, y: Int) {
    def this() {
      this(10, 20)
    }
  }

  class B(i: Int) extends A {

  }

  private val b: B = new B(10)


  class Creature {
    val range: Int = 10
    val env: Array[Int] = new Array[Int](range)
  }

  class Person extends {
    override val range: Int = 3
  } with Creature


  val p: Person = new Person
  println(p.range)
  println(p.env.length)
}
