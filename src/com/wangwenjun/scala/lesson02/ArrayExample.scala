package com.wangwenjun.scala.lesson02

object ArrayExample {

  def main(args: Array[String]): Unit = {

    /**
      *
      * val|var name:Array[Type] = new Array[Type](length)
      *
      */
    val arrs: Array[String] = new Array[String](3)
    arrs(0) = "Hello" //arrs.update(index,value)
    arrs(1) = "Scala"
    arrs(2) = "Kafka"

    /*for (x <- arrs) {
      println(x)
    }*/

    for (i <- 0.until(arrs.length)) {
      println(arrs(i)) //arrs.apply(index)
    }

    val arrs2: Array[String] = new Array[String](3)
    arrs2.update(0, "Hello1")
    arrs2.update(1, "Scala1")
    arrs2.update(2, "Kafka1")

    //0.to 10 [0,10-1]
    //0.until 10 [0,10)

    for (i <- 0.until(arrs2.length)) {
      println(arrs2.apply(i))
    }

    val arr3: Array[String] = Array("a", "b", "c")
    arr3.foreach(println)

    val i: Int = 3
    val j: Int = 4
    val x: Int = i.+(j)
    println(x)

    var y: Int = 10
    //y += 10
    y.+=(10)
    y += 10
    println(y)

    //for i in $(seq 0 100; do echo $i ;done;
    for (i <- 0 to 100) {
      println(i)
    }
  }
}
