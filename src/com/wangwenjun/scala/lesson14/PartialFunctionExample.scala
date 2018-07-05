package com.wangwenjun.scala.lesson14

/** *************************************
  * I041V0867618
  * @author:Alex Wang <br/>
  * @taobao:http: //wangwenjun0609.com
  * **************************************/
object PartialFunctionExample extends App {

  val f: PartialFunction[Char, Int] = {
    case '+' => 1
    case '-' => -1
  }

  println(f.isDefinedAt('-'))
  println(f.isDefinedAt('*'))

  println(f('+'))
  //below commented statement will throw MatchError Exception
  //println(f('*'))

  val divide: Int => Int = (x: Int) => 100 / x
  println(divide(10))

  //will throw java.lang.ArithmeticException: / by zero exception
  //println(divide(0))

  val dividePF: PartialFunction[Int, Int] = new PartialFunction[Int, Int] {
    def apply(x: Int) = 100 / x

    def isDefinedAt(x: Int) = x != 0
  }

  println {
    if (dividePF.isDefinedAt(0)) {
      dividePF(0)
    }
  }

  val dividePF2: PartialFunction[Int, Int] = {
    case x: Int if x != 0 => 100 / x
  }

  println {
    if (dividePF2.isDefinedAt(0)) {
      dividePF2(0)
    }
  }

  val convertNumToString = new PartialFunction[Int, String] {
    val nums = Array("One", "Two", "Three", "Four", "Five")

    override def isDefinedAt(x: Int) = {
      x > 0 && x < 6
    }

    override def apply(i: Int) = nums(i - 1)
  }

  //  println(convertNumToString(14))

  val convert1to5 = new PartialFunction[Int, String] {
    val nums = Array("One", "Two", "Three", "Four", "Five")

    override def isDefinedAt(i: Int) = {
      i > 0 && i < 6
    }

    override def apply(i: Int) = nums(i - 1)
  }

  val convert6to10 = new PartialFunction[Int, String] {
    val nums = Array("Six", "Seven", "Eight", "Nine", "Ten")

    override def isDefinedAt(i: Int) = {
      i > 5 && i < 11
    }

    override def apply(i: Int) = nums(i - 6)

  }

  val convert1to10: PartialFunction[Int, String] = convert1to5 orElse convert6to10

  println(convert1to10(3))
  println(convert1to10(8))

  List(0, 1, 2, 3).collect {
    dividePF2
  }.foreach(println)
}
