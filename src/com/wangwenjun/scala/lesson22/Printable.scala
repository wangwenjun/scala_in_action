package com.wangwenjun.scala.lesson22

trait Printable {

  def println(text: String): Unit = {
    printHeader()
    print(text)
    printTail()
  }

  def printHeader(): Unit

  def printTail(): Unit

  def print(text: String): Unit
}
