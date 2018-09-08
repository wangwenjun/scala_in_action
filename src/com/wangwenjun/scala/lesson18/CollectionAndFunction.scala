package com.wangwenjun.scala.lesson18

/** *************************************
  *
  * @author:Alex Wang <br/>
  * @taobao:http: //wangwenjun0609.taobao.com
  * **************************************/
object CollectionAndFunction extends App {

  val nums = List(1, 2, 3, 4, 5)
  val op: (Int, Int) => Int = (x, y) => x + y
  //reduce==reduceLeft
  println(nums.reduce(op))
  println(nums.reduceLeft(op))
  println(nums.reduceRight(op))
  println(nums.sum)

  //"Scala", "Java", "Kafka", "Akka"
  val strs = List("Scala", "Java", "Kafka", "Akka")
  val commaJoiner: (String, String) => String = (x, y) => x + "," + y
  println(strs.reduce(commaJoiner))
  println(strs.reduceLeft(commaJoiner))
  println(strs.reduceRight(commaJoiner))

  val bonus = List(1000.1, 343.43, 646.23)
  println(bonus.reduce(_ + _) + 2000.0)

  println(bonus.fold(2000.0)(_ + _))
  println(bonus.foldRight(2000.0)(_ + _))

  println(nums.scan(0)(_ + _))
  println(nums.scanLeft(0)(_ + _))
  println(nums.scanRight(0)(_ + _))
}
