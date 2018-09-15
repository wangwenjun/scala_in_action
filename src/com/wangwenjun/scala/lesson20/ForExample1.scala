package com.wangwenjun.scala.lesson20

import scala.annotation.varargs

/** *************************************
  *
  * @author:Alex Wang <br/>
  * @taobao:http: //wangwenjun0609.taobao.com
  ***************************************/
object ForExample1 extends App {

  @varargs case class Person(name: String, isMale: Boolean, children: Person*)

  private[this] val jack = Person("Jack", true)
  private[this] val alice = Person("Alice", false)
  private[this] val alex = Person("Alex", true, jack, alice)
  private[this] val persons = List(jack, alice, alex)

  val result = persons.filter(p => p.isMale && p.children.nonEmpty).map(p => p.children.map(c => (p.name, c.name)))
  println(result)

  val result2 = persons.filter(p => p.isMale).flatMap(p => p.children.map(c => (p.name, c.name)))
  println(result2)

  println("================")
  val result3 = for (p <- persons; if p.isMale; c <- p.children) yield (p.name, c.name)
  println(result3)

  println(for (l1 <- List(1, 2); l2 <- List("x", "y")) yield (l1, l2))
}
