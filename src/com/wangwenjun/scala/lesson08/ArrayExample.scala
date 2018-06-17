package com.wangwenjun.scala.lesson08

/** *************************************
  *
  * @author:Alex Wang <br/>
  *              http://wangwenjun0609.taobao.com
  * **************************************/
object ArrayExample extends App {

  /**
    * use the key word new
    */
  val arr1: Array[String] = new Array[String](3)

  /**
    * use singleton object
    */
  val arr2: Array[String] = Array("Hello", "Scala")

  println(arr2(0))
  println(arr2.apply(0))

  arr2(1) = "Java"
  arr2.update(1, "Java")
  println(arr2(1))

  for (x <- arr2) {
    println(x)
  }

  println("================")
  arr2.foreach(println)

  println("================")
  for (i <- 0 until arr2.length) {
    println(arr2(i))
  }
}
