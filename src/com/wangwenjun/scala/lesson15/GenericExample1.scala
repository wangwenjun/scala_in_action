package com.wangwenjun.scala.lesson15

/** *************************************
  *
  * @author:Alex Wang <br/>
  * @taobao:http: //wangwenjun0609.com
  ***************************************/
object GenericExample1 extends App {

  val p1: Person[String, Int] = new Person("Alex", 33)
  println(p1.first)
  println(p1.second)
  println("=============")
  private val clazz: Class[_ <: Person[String, Int]] = p1.getClass
  clazz.getDeclaredFields.foreach(println)
  println("=============")
  val p2 = new Person[Any, Any]("Tina", 31)
  println(s"${p2.first}==${p2.second}")

  println("==============")

  def getPersonSecondProperty[T1, T2](p: Person[T1, T2]): T2 = {
    p.second
  }

  println(getPersonSecondProperty(p1))

  def getMiddleFromArray[T](array: Array[T]): T = {
    array.apply(array.length./(2))
  }

  println(getMiddleFromArray(Array[Int](1, 2, 3, 4, 5, 6)))
  println(getMiddleFromArray(Array[String]("Alex", "Wang", "Wen", "Jun", "Scala")))

  val pair: Pair[String] = new Pair[String]("Alex", "Wang")
  println(pair.firstLessThanSecond)

}

class Person[T1, T2](val first: T1, val second: T2)

class Pair[T <: Comparable[T]](val first: T, val second: T) {

  def firstLessThanSecond: Boolean = if (first.compareTo(second) < 0) true else false
}