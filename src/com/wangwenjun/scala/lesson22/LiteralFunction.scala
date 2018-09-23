package com.wangwenjun.scala.lesson22

object LiteralFunction extends App {

  private[this] val name: String = "Alex"

  def fun: String => String = x => "Hello " + x

  println(fun(name))
}
