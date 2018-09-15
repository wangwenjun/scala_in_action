package com.wangwenjun.scala.lesson20

import scala.annotation.varargs

/** *************************************
  *
  * @author:Alex Wang <br/>
  * @taobao:http: //wangwenjun0609.taobao.com
  ***************************************/
object ForExample2 extends App {

  @varargs case class Book(title: String, authors: String*)

  val books: List[Book] = List(
    Book("Scala Programming", "Jack", "Alex"),
    Book("Java In Action", "Alice", "Tina"),
    Book("Kafka In Deep", "Alex", "Bill")
  )

  println(for (b <- books; if b.title.indexOf("In") >= 0) yield b.title)
  println(books.filter(b => b.title.indexOf("In") >= 0).map(_.title))

  println(for (b <- books; a <- b.authors; if a == "Alex") yield s"<<${b.title}>>")

  println(books.flatMap(b => b.authors.filter(_ == "Alex").map(_ => s"<<${b.title}>>")))
}
