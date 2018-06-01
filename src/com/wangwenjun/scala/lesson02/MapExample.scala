package com.wangwenjun.scala.lesson02

object MapExample extends App {

  var map: Map[String, String] = Map[String, String]()
  println(map.hashCode())
  map += "Hello" -> "World"
  println(map.hashCode())
  println(map)

  val m1: Map[String, String] = Map[String, String](
    ("Hello", "World"), ("Scala", "Java")
  )

  println(m1)

  val m2: Map[String, String] = Map[String, String](
    "Hello" -> "World",
    "Scala" -> "Java"
  )
  println(m2)
  println(m2.apply("Hello"))
  println(m2("Hello"))

  val m3: Map[String, String] = Map[String, String](("Scala", "Java")) ++ Map[String, String](("Hello", "World"))
  println(m3)
  println(m3.size)
  println(m3.empty)
  println("======================")

  val m4 = m3 - "Hello"

  println(m3)
  println(m4)
  println(m3.contains("Hello"))

  println("========================")

  m2.foreach(print)

  def print(e: (String, String)): Unit = {
    println(s"${e._1}=${e._2}")
  }

  import scala.collection.mutable.Map

  val m5: Map[String, String] = Map.empty[String, String]
  m5 += "Hello" -> "World"
  println(m5)
  println("==================")
  m5 - "Hello"
  m5.remove("Hello")
  simplePrint(m5)

  def simplePrint(m: Map[String, String]): Unit = {
    println(m)
  }
}