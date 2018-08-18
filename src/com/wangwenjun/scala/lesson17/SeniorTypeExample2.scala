package com.wangwenjun.scala.lesson17

/** *************************************
  *
  * @author:Alex Wang <br/>
  * @taobao:http: //wangwenjun0609.taobao.com
  ***************************************/
object SeniorTypeExample2 extends App {

  class Document {
    var title: String = _
    var author: String = _

    def setTitle(title: String): this.type = {
      this.title = title
      this
    }

    def setAuthor(author: String): this.type = {
      this.author = author
      this
    }

    override def toString: String = s"Title:${title},Author:${author}"
  }

  class Book extends Document {
    var content: String = _

    def addContent(content: String): this.type = {
      this.content = content

      this
    }

    override def toString: String = s"${super.toString},Content:${content}"
  }

  val document = new Document()

  println(document.setTitle("Scala").setAuthor("Alex"))

  val book: Book = new Book
  //println(book.addContent("Hello Scala").setTitle("Scala").setAuthor("Alex"))
  println(book.setAuthor("Alex").setTitle("Scala").addContent("Hello World"))


  object O {

  }

  val x: book.type = null

  val map: Map[String, Int] = Map()

  val m: String Map Int = Map()

  val i:Int=10

}