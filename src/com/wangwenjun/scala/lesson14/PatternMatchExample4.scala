package com.wangwenjun.scala.lesson14

/** *************************************
  *
  * @author:Alex Wang <br/>
  * **************************************/
object PatternMatchExample4 extends App {

  val arr: Array[Int] = Array[Int](1, 2, 3, 4, 5)

  val v: String = arr match {
    case Array(0) => "I am an array and have unique element zero."
    case Array(1, _*) => s"I am an array and the first element is one."
    case Array(x, y) => s"I am an array but have two element (${x},${y})"
    case _ => "i don't know how to describe."
  }
  println {
    v
  }

  val (x: Int, y: Int) = (1, 2)
  println(x)
  println(y)

  val (q, r) = BigInt(10) /% 3
  println(q)
  println(r)

  val Array(a, b, _*) = arr
  println(a)
  println(b)

  val m1: Map[String, String] = Map[String, String](
    "Alex" -> "Man",
    ("Alice", "Woman")
  )
  for ((k, v) <- m1) {
    println(s"${k}=${v}")
  }

  println("================")

  import java.util._
  import scala.collection.JavaConversions._

  val m2: Map[String, String] = new HashMap[String, String]()
  m2.put("alex", "man")
  m2.put("alice", "woman")
  for ((k, v) <- m2) {
    println(s"${k}=${v}")
  }
}
