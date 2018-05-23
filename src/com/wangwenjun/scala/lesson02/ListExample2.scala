package com.wangwenjun.scala.lesson02

object ListExample2 {

  def main(args: Array[String]): Unit = {
    //1.create
    println(List())
    println(Nil)
    println("===================")

    val list: List[String] = List("Java", "Scala", "Spark", "Kafka", "Akka")
    println(list)
    println("===================")

    val list2: List[Int] = 1 :: 2 :: 3 :: Nil
    println(list2)

    println("===================")

    val list3: List[Int] = List(1, 2) ::: List(3, 4)
    println(list3)
    println("===================")

    println(list(1))
    println(list.apply(1))

    println("===================")

    val count: Int = list.count((s: String) => s.length > 4)
    println(count)

    println("===================")
    println(list.drop(2))

    println("===================")
    println(list.dropRight(2))

    val result: Boolean = list.exists((s: String) => s.length == 4)
    println(result)
    println("===================")
    println(list.filter((s: String) => s.length > 4))
    println("===================")

    println(list.forall(s => s.length > 4))
    println("===================")
    println(list.length)

    println("===================")
    for (e <- list) {
      println(e)
    }
    println("**********************")
    for (i <- 0 until list.length) {
      println(list(i))
    }

    println("**********************1")
    list.foreach((s: String) => println(s))
    println("**********************2")
    list.foreach(println)
    println("**********************3")
    list.foreach(println(_))
    println("**********************4")
    println(list.head)
    println(list.last)
    println(list.isEmpty)
    println(list.mkString(","))

    println(list.init)
    println(list.tail)

    println(list.reverse)

    val newList: List[Int] = list.map((s: String) => s.length)
    println(newList)


    println(list.sortWith((l, r) => l.charAt(0) < r.charAt(0)))
  }
}
