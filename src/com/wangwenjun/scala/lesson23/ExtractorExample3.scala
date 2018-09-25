package com.wangwenjun.scala.lesson23

import com.wangwenjun.scala.lesson23.ExtractorExample2.Email

object ExtractorExample3 extends App {

  object Twice {
    def apply(str: String): String = str * 2

    def unapply(arg: String): Option[String] = Some(arg.substring(arg.length / 2))
  }

  val result: String = Twice("Hello")
  println(result)
  val Twice(str: String) = "HelloHello"
  println(str)

  "HelloHello" match {
    case Twice(e) => println(e)
    case _ => println("not twice character.")
  }

  class Test(val i: Int)

  object Test {
    def apply(i: Int): Test = new Test(i)

    def unapply(arg: Test): Option[Int] = Some(arg.i)
  }

  val Test(i: Int) = new Test(10)
  println(i)


  object UpperCase {
    def unapply(arg: String): Boolean = arg == arg.toUpperCase
  }

  "ALEX.WANGALEX.WANG@SCALA.COM" match {
    case Email(Twice(name@UpperCase()), domain) => println(s"${name}=1==${domain}")
    case Email(u: String, d: String) => println(s"${u}==2=${d}")
    case _ => println("invalid email address")
  }
}
