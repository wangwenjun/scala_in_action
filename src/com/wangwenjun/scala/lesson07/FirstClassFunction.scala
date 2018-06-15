package com.wangwenjun.scala.lesson07

/** *************************************
  *
  * @author:Alex Wang <br/>
  *              http://wangwenjun0609.taobao.com
  ***************************************/
object FirstClassFunction extends App {

  val increment: Int => Int = (x: Int) => x + 1
  val x: Int = 10
  println(inc(x))
  println(increment(x))

  def inc(x: Int): Int = {
    x + 1
  }

  private val add: (Int, Int) => Int = (x: Int, y: Int) => x + y
  private val subtract: (Int, Int) => Int = (x: Int, y: Int) => x - y
  private val divide: (Int, Int) => Int = (x: Int, y: Int) => {
    require(y != 0)
    x / y
  }
  private val multiply: (Int, Int) => Int = (x: Int, y: Int) => x * y

  def calculate(op: (Int, Int) => Int, x: Int, y: Int): Int = {
    op(x, y)
  }

  try {
    println(calculate(add, 10, 20))
    println(calculate(subtract, 10, 20))
    println(calculate(divide, 10, 20))
    println(calculate(multiply, 10, 20))
  } catch {
    case e: Exception => e.printStackTrace()
  }

  println(calculate((x, y) => {
    x / 10 + y * 2
  }, 10, 100))

  def tax(x: Double): Double => Double = {
    if (x >= 3500.00 && x <= 5000.00) {
      x => x + 100.00
    } else {
      x => x - 10.1
    }
  }

  val salary: Double = 4000.00
  println(tax(salary)(salary))
  println(tax(salary*10)(salary*10))
}
