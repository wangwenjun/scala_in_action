package com.wangwenjun.scala.lesson02

import scala.collection.mutable

object SetExample extends App {

  import scala.collection.mutable.Set

  val s1: Set[String] = Set("Scala", "Kafka", "Kafka")
  println(s1)


  //  s1 += "Hello"

  private val s2: mutable.Set[String] = s1 + "Hello"
  println(s1)
  println(s2)
  private val s3: Set[String] = Set("1", "2") + "3" + "4"
  println(s3)

  println(Set(1, 2) ++ Set(3, 4))

  println(s1 - "Scala")
  println(s3("3"))
  println(s3.apply("3"))
  println(s3.contains("3"))

  println(Set(1, 2).intersect(Set(1, 3)))
  println(Set(1, 2) & Set(1, 3))

  println(Set(1, 2).diff(Set(1, 3)))
  println(Set(1, 2) &~ Set(1, 3))

  println(Set(1, 2) | Set(1, 3))
  println(Set(1, 2).union(Set(1, 3)))


  println(Set())
  println(Set.empty[String])
  println(Set(1, 2, 3).isEmpty)
  println(Set(1, 2, 3).size)

  println(Set(1, 2, 3).head)
  println(Set(1, 2, 3).last)
  println(Set(1, 2, 3).tail)

  val s4: Set[Int] = Set(1, 2, 3, 4, 5)
  for (i <- s4) {
    println(i)
  }

  s4.foreach(println)
  s4.foreach(i => println(i))
  s4.foreach(println(_))
  s4.foreach((i: Int) => println(i))

  val s5: mutable.Set[Int] = mutable.SortedSet(1, 2, 3, 5, 4, 10, 7)
  s5.foreach(println(_))

  private val count: Int = s5.count(i => i > 4)
  println(count)
}
