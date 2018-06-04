package com.wangwenjun.scala.lesson03

object ClassExampleTest {

  def main(args: Array[String]) {
    val c: ClassExample = new ClassExample
    //  val c: ClassExample = new ClassExample()
    println(c.accumulator)
    c.getClass.getDeclaredMethods.foreach(m => {
      println(m.getName)
      println(m.getParameterCount)
      println("===================")
    })

    c accumulator_$eq 100
    println(c.accumulator)
    c.increment
    c.increment

    println(c.get)
    println(c.printAccumulator)
  }

}
