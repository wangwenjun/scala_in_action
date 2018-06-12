package com.wangwenjun.scala.lesson06

/** *************************************
  *
  * @author:Alex Wang <br/>
  *              http://wangwenjun0609.taobao.com
  * **************************************/
object FOR extends App {

  private val inclusive: Range.Inclusive = 0 to 10
  private val range: Range = 0 until 10

  val arr: Array[Int] = Array(1, 2, 3, 4)
  for (i <- arr) {
    println(i)
  }
  for (i <- 0 to 10) {
    println(i)
  }

  println("=====================")
  var count: Int = 0
  for (i <- 0 to 10) {
    if (i % 2 == 0) {
      println(i)
    }
    count += 1
  }

  println(count)
  count = 0
  println("=====================")

  for (i <- 0 to 10
       if i % 2 == 0
       if i < 8) {
    println(i)
    count += 1
  }
  println(count)

  println("=====================")

  for (i <- 1 until 10) {
    for (j <- 1 to i) {
      print(s"${j}*${i}=${i * j}\t")
    }
    println()
  }

  println("=====================")
  val result: Unit = for (i <- 0 to 10) {
    println(i)
  }
  println(result == ())
  //yield hint
  println("=====================")

  val rtn = for {i <- 0 to 10 if i % 2 == 0} yield {
    val x: Int = i * 2
    "Alex" * x
  }
  println(rtn)
  println(rtn.getClass())

  val a: Array[Int] = Array(1, 2, 3, 4, 5)

  a.filter(p => p > 3).map(p => "Alex" * p).foreach(println)


  var i: Int = 0
  var break: Boolean = false
  while (i <= 10 && !break) {
    if (i == 5) break = true
    println(i)
    i += 1
  }
  println("===============")
  for (i <- 0 to 10) {
    if (i != 5) {
      println(i)
    }
  }
}