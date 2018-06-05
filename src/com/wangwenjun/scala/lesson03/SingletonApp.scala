package com.wangwenjun.scala.lesson03

object SingletonApp {

  def main(args: Array[String]): Unit = {
    println(DateUtils.currentDate)
    println(DateUtils.currentTime)

    val companion: Companion = Companion("Hello")
    companion.simplePrint()
  }
}
