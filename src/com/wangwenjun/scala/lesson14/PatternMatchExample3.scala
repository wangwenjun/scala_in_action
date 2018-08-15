package com.wangwenjun.scala.lesson14

/** *************************************
  *
  * @author:Alex Wang <br/>
  * **************************************/
object PatternMatchExample3 extends App {

  val seq: Seq[Int] = Seq[Int](1, 2, 3, 4, 5)
  for (i <- seq) {
    i match {
      case 5 => println("five")
      case _: Int if i % 2 == 0 => println("I am odd " + i)
      case _: Int => println("I am Int " + i)
    }
  }

  val tuples = Seq(
    ("Scala", "Java", "Clojure")
  , ("Alex", "Wen", "Jun")
  , ("Kafka", "spark")
  , ("Kafka", "spark", "sdfdsfds", "dsfdsfds")
  )

  for (t <- tuples) {
    t match {
      case ("Scala", _, _) => println("scala tuple")
      case (x, y, z) => println(s"${x}===${y}===${z}")
      case (x, y) => println(s"${x}====${y}")
      case _ => println("unknown " + t)
    }
  }
}