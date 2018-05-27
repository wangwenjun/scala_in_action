package com.wangwenjun.scala.lesson02

object TupleExample {

  def main(args: Array[String]): Unit = {

    val t1: Tuple2[Int, String] = (1, "Scala")
    val t2: (Int, String) = (2, "Java")
    val t3 = (3, "Kafka")

    println(t1._1)
    println(t2._2)
    println(t3._1)

    val result: (Int, String) = rtn()
    println(result._1)
    println(result._2)
  }

  def rtn(): (Int, String) = {
    /**
      * business handle
      */
    (30, "Alex")
  }
}
