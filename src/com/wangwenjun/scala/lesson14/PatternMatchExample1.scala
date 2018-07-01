package com.wangwenjun.scala.lesson14

/** *************************************
  *
  * @author:Alex Wang <br/>
  *              http://wangwenjun0609.taobao.com
  * **************************************/
object PatternMatchExample1 extends App {

  val bools: Seq[Boolean] = Seq(false, true)
  for (bool <- bools) {
    bool match {
      case xyz => println("xyz====" + xyz)
      case true => println("I am true.")
    }
  }

  val seq: Seq[Any] = Seq[Any](1, 2, 2.3, "hello", "world", 'xyz)
  for (s <- seq) {
    val result: String = s match {
      case 1 => "Int 1"
      case i: Int => "I am int " + i
      case d: Double => "I am double " + d
      case "hello" => s.toString
      case x: String => "I am string " + x
      case _ => "unexpected"
    }
    println(result)
  }

  println("===================")

  //  val seq2: Seq[Any] = Seq[Any](1, 2, 2.3, 'xyz)
  for (s <- seq) {
    val result: String = s match {
      case 1 => "Int 1"
      case _: Int => "I am int " + s
      case _: Double => "I am double " + s
      case "hello" => s.toString
      case _: String => "I am string " + s
      case _ => "unexpected"
    }
    println(result)
  }

  println("================")
  val seq3: Seq[Int] = Seq[Int](1, 2, 3)

  final val Y: Int = 2

  def printMe(y: Int): Unit = {
    for {
      x <- seq3
    } {
      val result = x match {
        case `y` => "found y =" + x
        case _: Int => "int " + x
      }
      println(result)
    }
  }

  printMe(2)

  println("=================")
  for (s <- seq) {
    val result: String = s match {
      case 1 => "Int 1"
      case _: Int | _: Double => "I am number type " + s
      case "hello" => s.toString
      case _: String => "I am string " + s
      case _ => "unexpected"
    }
    println(result)
  }
}
