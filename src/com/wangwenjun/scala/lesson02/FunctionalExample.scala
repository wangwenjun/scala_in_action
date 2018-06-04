package com.wangwenjun.scala.lesson02

import scala.io.{BufferedSource, Source}

object FunctionalExample extends App {

  val list: List[String] = List[String]("1", "2", "3", "4")

  var i: Int = 0
  while (i < list.size) {
    println(list.apply(i))
    i += 1
  }
  println("==============")

  list.foreach((i: String) => println(i))
  list.foreach(println(_))
  list.foreach(println)
  for (v <- list) {
    println(v)
  }
  println("==============")

  val source: BufferedSource = Source.fromFile("C:\\Users\\wangwenjun\\IdeaProjects\\scala_in_action\\src\\com\\wangwenjun\\scala\\lesson02\\FunctionalExample.scala")
  var maxLength: Int = 0
  for (l <- source.getLines) {
    println(l)
    //maxLength.max(l.length)
    maxLength = maxLength max l.length
  }

  println(maxLength)

  var result: String = Source.fromFile("C:\\Users\\wangwenjun\\IdeaProjects\\scala_in_action\\src\\com\\wangwenjun\\scala\\lesson02\\FunctionalExample.scala").getLines().toList.reduceLeft(
    (r, l) => if (r.length > l.length) r else l
  )
  println(result)
  println(result.length)

}
